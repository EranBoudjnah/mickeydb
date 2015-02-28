/*
 * generated by Xtext
 */
package com.justeat.mickeydb.generator

import com.google.inject.Inject
import com.google.inject.Provider
import com.justeat.mickeydb.MickeyAssembler
import com.justeat.mickeydb.MickeyDatabaseModel
import com.justeat.mickeydb.mickeyLang.CreateTableStatement
import com.justeat.mickeydb.mickeyLang.CreateViewStatement
import com.justeat.mickeydb.mickeyLang.MigrationBlock
import com.justeat.mickeydb.mickeyLang.Model
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

import static extension com.justeat.mickeydb.ModelUtil.*
import static extension com.justeat.mickeydb.Strings.*
import java.math.BigDecimal
import org.eclipse.xtext.scoping.IScopeProvider
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage
import org.eclipse.emf.ecore.EReference

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MickeyLangGenerator implements IGenerator {
	
	@Inject SqliteOpenHelperGenerator mOpenHelperGenerator
	@Inject ContentProviderContractGenerator mContentProviderContractGenerator
	@Inject ContentProviderGenerator mContentProviderGenerator
	@Inject Provider<SqliteMigrationGenerator> mMigrationGenerator
	@Inject ActiveRecordGenerator mActiveRecordGenerator
	
	@Inject MickeyAssembler assembler;

	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		if(!resource.URI.toString.contains("init.mickey")) {
			return;
		}
		
		var mickeyModel = assembler.assemble(resource)
		
		val stubOutput = "" //MechanoidOutputConfigurationProvider::DEFAULT_STUB_OUTPUT;
		
		 mickeyModel.databases.values.forEach[				
				fsa.generateFile(
					packageName.resolveFileName("Abstract".concat(databaseName.pascalize).concat("OpenHelper")), 
					mOpenHelperGenerator.generate(it)
				);
//				fsa.generateFile(
//					packageName.resolveFileName(databaseName.pascalize.concat("OpenHelper")), 
//					stubOutput, 
//					mOpenHelperGenerator.generateStub(it, snapshot)
//				);
				fsa.generateFile(
					packageName.resolveFileName(databaseName.pascalize.concat("Contract")), 
					mContentProviderContractGenerator.generate(it)
				);
				
				fsa.generateFile(
					packageName.resolveFileName("Abstract".concat(databaseName.pascalize).concat("ContentProvider")), 
					mContentProviderGenerator.generate(it)
				);
				
//				fsa.generateFile(
//					packageName.resolveFileName(databaseName.pascalize.concat("ContentProvider")), 
//					stubOutput, 
//					mContentProviderGenerator.generateStub(it, snapshot)
//				);
				
				snapshot.tables.forEach[
					statement|
					generateActiveRecordEntity(it, resource, fsa, statement as CreateTableStatement)
				];
				
				snapshot.views.forEach[
					statement|
					generateActiveRecordEntity(it, resource, fsa, statement as CreateViewStatement)
				];
				
				it.initTables.forEach[
					statement|
					generateActiveRecordEntity(it, resource, fsa, statement as CreateTableStatement)
				];
				
				it.initViews.forEach[
					statement|
					generateActiveRecordEntity(it, resource, fsa, statement as CreateViewStatement)
				];
				
				it.migrations.forEach[
					item,index|generateMigration(packageName, databaseName, resource, fsa, item, item.version)
				];			 	
		 ]
	}
	
	def void generateActiveRecordEntity(MickeyDatabaseModel model, Resource resource, IFileSystemAccess fsa, CreateTableStatement statement) {
		
		if(statement.hasAndroidPrimaryKey) {
			var genFileName = model.packageName.resolveFileName(statement.name.pascalize.concat("Record"))
				
			fsa.generateFile(genFileName, 
				mActiveRecordGenerator.generate(model.packageName, model.databaseName, statement)
			)	
		}	
	}
	
	def void generateActiveRecordEntity(MickeyDatabaseModel model, Resource resource, IFileSystemAccess fsa, CreateViewStatement statement) {
		
		if(statement.hasAndroidPrimaryKey) {
			var genFileName = model.packageName.resolveFileName(statement.name.pascalize.concat("Record"))
				
			fsa.generateFile(genFileName, 
				mActiveRecordGenerator.generate(model.packageName, model.databaseName, statement)
			)	
		}	
	}

	def void generateMigration(String packageName, String databaseName, Resource resource, IFileSystemAccess fsa, MigrationBlock migration, BigDecimal version) { 
		
		var model = resource.contents.head as Model;
		
		var genFileName = packageName.concat(".migrations").resolveFileName("Default".concat(databaseName.pascalize).concat("MigrationV").concat(String::valueOf(version)))
			
		var generator = mMigrationGenerator.get()
		
		fsa.generateFile(genFileName, 
			generator.generate(model, packageName, databaseName, migration, version)
		)
	}
}