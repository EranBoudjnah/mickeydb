/**
 */
package com.justeat.mickeydb.mickeyLang.util;

import com.justeat.mickeydb.mickeyLang.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage
 * @generated
 */
public class MickeyLangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MickeyLangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MickeyLangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MickeyLangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MickeyLangSwitch<Adapter> modelSwitch =
    new MickeyLangSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseMickeyBlock(MickeyBlock object)
      {
        return createMickeyBlockAdapter();
      }
      @Override
      public Adapter caseMickeyFunction(MickeyFunction object)
      {
        return createMickeyFunctionAdapter();
      }
      @Override
      public Adapter caseActionStatement(ActionStatement object)
      {
        return createActionStatementAdapter();
      }
      @Override
      public Adapter caseFunctionArg(FunctionArg object)
      {
        return createFunctionArgAdapter();
      }
      @Override
      public Adapter caseContentUri(ContentUri object)
      {
        return createContentUriAdapter();
      }
      @Override
      public Adapter caseContentUriSegment(ContentUriSegment object)
      {
        return createContentUriSegmentAdapter();
      }
      @Override
      public Adapter caseMigrationBlock(MigrationBlock object)
      {
        return createMigrationBlockAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseCase(Case object)
      {
        return createCaseAdapter();
      }
      @Override
      public Adapter caseSelectStatement(SelectStatement object)
      {
        return createSelectStatementAdapter();
      }
      @Override
      public Adapter caseOrderingTermList(OrderingTermList object)
      {
        return createOrderingTermListAdapter();
      }
      @Override
      public Adapter caseSelectCoreExpression(SelectCoreExpression object)
      {
        return createSelectCoreExpressionAdapter();
      }
      @Override
      public Adapter caseSelectList(SelectList object)
      {
        return createSelectListAdapter();
      }
      @Override
      public Adapter caseWhereExpressions(WhereExpressions object)
      {
        return createWhereExpressionsAdapter();
      }
      @Override
      public Adapter caseGroupByExpressions(GroupByExpressions object)
      {
        return createGroupByExpressionsAdapter();
      }
      @Override
      public Adapter caseHavingExpressions(HavingExpressions object)
      {
        return createHavingExpressionsAdapter();
      }
      @Override
      public Adapter caseOrderingTerm(OrderingTerm object)
      {
        return createOrderingTermAdapter();
      }
      @Override
      public Adapter caseJoinSource(JoinSource object)
      {
        return createJoinSourceAdapter();
      }
      @Override
      public Adapter caseSingleSource(SingleSource object)
      {
        return createSingleSourceAdapter();
      }
      @Override
      public Adapter caseSelectSource(SelectSource object)
      {
        return createSelectSourceAdapter();
      }
      @Override
      public Adapter caseSingleSourceJoin(SingleSourceJoin object)
      {
        return createSingleSourceJoinAdapter();
      }
      @Override
      public Adapter caseJoinStatement(JoinStatement object)
      {
        return createJoinStatementAdapter();
      }
      @Override
      public Adapter caseColumnSource(ColumnSource object)
      {
        return createColumnSourceAdapter();
      }
      @Override
      public Adapter caseLiteralValue(LiteralValue object)
      {
        return createLiteralValueAdapter();
      }
      @Override
      public Adapter caseDDLStatement(DDLStatement object)
      {
        return createDDLStatementAdapter();
      }
      @Override
      public Adapter caseTableDefinition(TableDefinition object)
      {
        return createTableDefinitionAdapter();
      }
      @Override
      public Adapter caseCreateTriggerStatement(CreateTriggerStatement object)
      {
        return createCreateTriggerStatementAdapter();
      }
      @Override
      public Adapter caseAlterTableAddColumnStatement(AlterTableAddColumnStatement object)
      {
        return createAlterTableAddColumnStatementAdapter();
      }
      @Override
      public Adapter caseDropTableStatement(DropTableStatement object)
      {
        return createDropTableStatementAdapter();
      }
      @Override
      public Adapter caseDropTriggerStatement(DropTriggerStatement object)
      {
        return createDropTriggerStatementAdapter();
      }
      @Override
      public Adapter caseDropViewStatement(DropViewStatement object)
      {
        return createDropViewStatementAdapter();
      }
      @Override
      public Adapter caseCreateIndexStatement(CreateIndexStatement object)
      {
        return createCreateIndexStatementAdapter();
      }
      @Override
      public Adapter caseDropIndexStatement(DropIndexStatement object)
      {
        return createDropIndexStatementAdapter();
      }
      @Override
      public Adapter caseColumnConstraint(ColumnConstraint object)
      {
        return createColumnConstraintAdapter();
      }
      @Override
      public Adapter caseTableConstraint(TableConstraint object)
      {
        return createTableConstraintAdapter();
      }
      @Override
      public Adapter caseUniqueTableConstraint(UniqueTableConstraint object)
      {
        return createUniqueTableConstraintAdapter();
      }
      @Override
      public Adapter casePrimaryConstraint(PrimaryConstraint object)
      {
        return createPrimaryConstraintAdapter();
      }
      @Override
      public Adapter caseCheckTableConstraint(CheckTableConstraint object)
      {
        return createCheckTableConstraintAdapter();
      }
      @Override
      public Adapter caseIndexedColumn(IndexedColumn object)
      {
        return createIndexedColumnAdapter();
      }
      @Override
      public Adapter caseDefaultValue(DefaultValue object)
      {
        return createDefaultValueAdapter();
      }
      @Override
      public Adapter caseConflictClause(ConflictClause object)
      {
        return createConflictClauseAdapter();
      }
      @Override
      public Adapter caseDMLStatement(DMLStatement object)
      {
        return createDMLStatementAdapter();
      }
      @Override
      public Adapter caseDeleteStatement(DeleteStatement object)
      {
        return createDeleteStatementAdapter();
      }
      @Override
      public Adapter caseInsertStatement(InsertStatement object)
      {
        return createInsertStatementAdapter();
      }
      @Override
      public Adapter caseUpdateStatement(UpdateStatement object)
      {
        return createUpdateStatementAdapter();
      }
      @Override
      public Adapter caseUpdateColumnExpression(UpdateColumnExpression object)
      {
        return createUpdateColumnExpressionAdapter();
      }
      @Override
      public Adapter caseContentUriParamSegment(ContentUriParamSegment object)
      {
        return createContentUriParamSegmentAdapter();
      }
      @Override
      public Adapter caseExprConcat(ExprConcat object)
      {
        return createExprConcatAdapter();
      }
      @Override
      public Adapter caseExprMult(ExprMult object)
      {
        return createExprMultAdapter();
      }
      @Override
      public Adapter caseExprAdd(ExprAdd object)
      {
        return createExprAddAdapter();
      }
      @Override
      public Adapter caseExprBit(ExprBit object)
      {
        return createExprBitAdapter();
      }
      @Override
      public Adapter caseExprRelate(ExprRelate object)
      {
        return createExprRelateAdapter();
      }
      @Override
      public Adapter caseExprEqual(ExprEqual object)
      {
        return createExprEqualAdapter();
      }
      @Override
      public Adapter caseExprAnd(ExprAnd object)
      {
        return createExprAndAdapter();
      }
      @Override
      public Adapter caseExprOr(ExprOr object)
      {
        return createExprOrAdapter();
      }
      @Override
      public Adapter caseNullCheckExpression(NullCheckExpression object)
      {
        return createNullCheckExpressionAdapter();
      }
      @Override
      public Adapter caseIsNull(IsNull object)
      {
        return createIsNullAdapter();
      }
      @Override
      public Adapter caseNotNull(NotNull object)
      {
        return createNotNullAdapter();
      }
      @Override
      public Adapter caseNewColumn(NewColumn object)
      {
        return createNewColumnAdapter();
      }
      @Override
      public Adapter caseOldColumn(OldColumn object)
      {
        return createOldColumnAdapter();
      }
      @Override
      public Adapter caseColumnSourceRef(ColumnSourceRef object)
      {
        return createColumnSourceRefAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseNestedExpression(NestedExpression object)
      {
        return createNestedExpressionAdapter();
      }
      @Override
      public Adapter caseSelectStatementExpression(SelectStatementExpression object)
      {
        return createSelectStatementExpressionAdapter();
      }
      @Override
      public Adapter caseCaseExpression(CaseExpression object)
      {
        return createCaseExpressionAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseCastExpression(CastExpression object)
      {
        return createCastExpressionAdapter();
      }
      @Override
      public Adapter caseFunctionArgument(FunctionArgument object)
      {
        return createFunctionArgumentAdapter();
      }
      @Override
      public Adapter caseSelectCore(SelectCore object)
      {
        return createSelectCoreAdapter();
      }
      @Override
      public Adapter caseSelectExpression(SelectExpression object)
      {
        return createSelectExpressionAdapter();
      }
      @Override
      public Adapter caseSingleSourceTable(SingleSourceTable object)
      {
        return createSingleSourceTableAdapter();
      }
      @Override
      public Adapter caseSingleSourceSelectStatement(SingleSourceSelectStatement object)
      {
        return createSingleSourceSelectStatementAdapter();
      }
      @Override
      public Adapter caseResultColumn(ResultColumn object)
      {
        return createResultColumnAdapter();
      }
      @Override
      public Adapter caseNumericLiteral(NumericLiteral object)
      {
        return createNumericLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseNullLiteral(NullLiteral object)
      {
        return createNullLiteralAdapter();
      }
      @Override
      public Adapter caseCurrentTimeLiteral(CurrentTimeLiteral object)
      {
        return createCurrentTimeLiteralAdapter();
      }
      @Override
      public Adapter caseCurrentDateLiteral(CurrentDateLiteral object)
      {
        return createCurrentDateLiteralAdapter();
      }
      @Override
      public Adapter caseCurrentTimeStampLiteral(CurrentTimeStampLiteral object)
      {
        return createCurrentTimeStampLiteralAdapter();
      }
      @Override
      public Adapter caseCreateTableStatement(CreateTableStatement object)
      {
        return createCreateTableStatementAdapter();
      }
      @Override
      public Adapter caseCreateViewStatement(CreateViewStatement object)
      {
        return createCreateViewStatementAdapter();
      }
      @Override
      public Adapter caseAlterTableRenameStatement(AlterTableRenameStatement object)
      {
        return createAlterTableRenameStatementAdapter();
      }
      @Override
      public Adapter caseColumnDef(ColumnDef object)
      {
        return createColumnDefAdapter();
      }
      @Override
      public Adapter casePrimaryKeyColumnConstraint(PrimaryKeyColumnConstraint object)
      {
        return createPrimaryKeyColumnConstraintAdapter();
      }
      @Override
      public Adapter caseNotNullConstraint(NotNullConstraint object)
      {
        return createNotNullConstraintAdapter();
      }
      @Override
      public Adapter caseUniqueConstraint(UniqueConstraint object)
      {
        return createUniqueConstraintAdapter();
      }
      @Override
      public Adapter caseDefaultConstraint(DefaultConstraint object)
      {
        return createDefaultConstraintAdapter();
      }
      @Override
      public Adapter caseCheckConstraint(CheckConstraint object)
      {
        return createCheckConstraintAdapter();
      }
      @Override
      public Adapter caseLiteralDefaultValue(LiteralDefaultValue object)
      {
        return createLiteralDefaultValueAdapter();
      }
      @Override
      public Adapter caseExpressionDefaultValue(ExpressionDefaultValue object)
      {
        return createExpressionDefaultValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.MickeyBlock <em>Mickey Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.MickeyBlock
   * @generated
   */
  public Adapter createMickeyBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.MickeyFunction <em>Mickey Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.MickeyFunction
   * @generated
   */
  public Adapter createMickeyFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ActionStatement
   * @generated
   */
  public Adapter createActionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.FunctionArg <em>Function Arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.FunctionArg
   * @generated
   */
  public Adapter createFunctionArgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ContentUri <em>Content Uri</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ContentUri
   * @generated
   */
  public Adapter createContentUriAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ContentUriSegment <em>Content Uri Segment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ContentUriSegment
   * @generated
   */
  public Adapter createContentUriSegmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.MigrationBlock <em>Migration Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.MigrationBlock
   * @generated
   */
  public Adapter createMigrationBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.Case
   * @generated
   */
  public Adapter createCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.SelectStatement
   * @generated
   */
  public Adapter createSelectStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.OrderingTermList <em>Ordering Term List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.OrderingTermList
   * @generated
   */
  public Adapter createOrderingTermListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.SelectCoreExpression <em>Select Core Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.SelectCoreExpression
   * @generated
   */
  public Adapter createSelectCoreExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.SelectList <em>Select List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.SelectList
   * @generated
   */
  public Adapter createSelectListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.WhereExpressions <em>Where Expressions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.WhereExpressions
   * @generated
   */
  public Adapter createWhereExpressionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.GroupByExpressions <em>Group By Expressions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.GroupByExpressions
   * @generated
   */
  public Adapter createGroupByExpressionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.HavingExpressions <em>Having Expressions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.HavingExpressions
   * @generated
   */
  public Adapter createHavingExpressionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.OrderingTerm <em>Ordering Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.OrderingTerm
   * @generated
   */
  public Adapter createOrderingTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.JoinSource <em>Join Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.JoinSource
   * @generated
   */
  public Adapter createJoinSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.SingleSource <em>Single Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.SingleSource
   * @generated
   */
  public Adapter createSingleSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.SelectSource <em>Select Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.SelectSource
   * @generated
   */
  public Adapter createSelectSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.SingleSourceJoin <em>Single Source Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.SingleSourceJoin
   * @generated
   */
  public Adapter createSingleSourceJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.JoinStatement <em>Join Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.JoinStatement
   * @generated
   */
  public Adapter createJoinStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ColumnSource <em>Column Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ColumnSource
   * @generated
   */
  public Adapter createColumnSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.LiteralValue <em>Literal Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.LiteralValue
   * @generated
   */
  public Adapter createLiteralValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.DDLStatement <em>DDL Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.DDLStatement
   * @generated
   */
  public Adapter createDDLStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.TableDefinition <em>Table Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.TableDefinition
   * @generated
   */
  public Adapter createTableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.CreateTriggerStatement <em>Create Trigger Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.CreateTriggerStatement
   * @generated
   */
  public Adapter createCreateTriggerStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.AlterTableAddColumnStatement <em>Alter Table Add Column Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.AlterTableAddColumnStatement
   * @generated
   */
  public Adapter createAlterTableAddColumnStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.DropTableStatement <em>Drop Table Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.DropTableStatement
   * @generated
   */
  public Adapter createDropTableStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.DropTriggerStatement <em>Drop Trigger Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.DropTriggerStatement
   * @generated
   */
  public Adapter createDropTriggerStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.DropViewStatement <em>Drop View Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.DropViewStatement
   * @generated
   */
  public Adapter createDropViewStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.CreateIndexStatement <em>Create Index Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.CreateIndexStatement
   * @generated
   */
  public Adapter createCreateIndexStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.DropIndexStatement <em>Drop Index Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.DropIndexStatement
   * @generated
   */
  public Adapter createDropIndexStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ColumnConstraint <em>Column Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ColumnConstraint
   * @generated
   */
  public Adapter createColumnConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.TableConstraint <em>Table Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.TableConstraint
   * @generated
   */
  public Adapter createTableConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.UniqueTableConstraint <em>Unique Table Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.UniqueTableConstraint
   * @generated
   */
  public Adapter createUniqueTableConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.PrimaryConstraint <em>Primary Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.PrimaryConstraint
   * @generated
   */
  public Adapter createPrimaryConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.CheckTableConstraint <em>Check Table Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.CheckTableConstraint
   * @generated
   */
  public Adapter createCheckTableConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.IndexedColumn <em>Indexed Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.IndexedColumn
   * @generated
   */
  public Adapter createIndexedColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.DefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.DefaultValue
   * @generated
   */
  public Adapter createDefaultValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ConflictClause <em>Conflict Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ConflictClause
   * @generated
   */
  public Adapter createConflictClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.DMLStatement <em>DML Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.DMLStatement
   * @generated
   */
  public Adapter createDMLStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.DeleteStatement <em>Delete Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.DeleteStatement
   * @generated
   */
  public Adapter createDeleteStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.InsertStatement <em>Insert Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.InsertStatement
   * @generated
   */
  public Adapter createInsertStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.UpdateStatement <em>Update Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.UpdateStatement
   * @generated
   */
  public Adapter createUpdateStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.UpdateColumnExpression <em>Update Column Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.UpdateColumnExpression
   * @generated
   */
  public Adapter createUpdateColumnExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ContentUriParamSegment <em>Content Uri Param Segment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ContentUriParamSegment
   * @generated
   */
  public Adapter createContentUriParamSegmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ExprConcat <em>Expr Concat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ExprConcat
   * @generated
   */
  public Adapter createExprConcatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ExprMult <em>Expr Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ExprMult
   * @generated
   */
  public Adapter createExprMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ExprAdd <em>Expr Add</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ExprAdd
   * @generated
   */
  public Adapter createExprAddAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ExprBit <em>Expr Bit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ExprBit
   * @generated
   */
  public Adapter createExprBitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ExprRelate <em>Expr Relate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ExprRelate
   * @generated
   */
  public Adapter createExprRelateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ExprEqual <em>Expr Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ExprEqual
   * @generated
   */
  public Adapter createExprEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ExprAnd <em>Expr And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ExprAnd
   * @generated
   */
  public Adapter createExprAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ExprOr <em>Expr Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ExprOr
   * @generated
   */
  public Adapter createExprOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.NullCheckExpression <em>Null Check Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.NullCheckExpression
   * @generated
   */
  public Adapter createNullCheckExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.IsNull <em>Is Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.IsNull
   * @generated
   */
  public Adapter createIsNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.NotNull <em>Not Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.NotNull
   * @generated
   */
  public Adapter createNotNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.NewColumn <em>New Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.NewColumn
   * @generated
   */
  public Adapter createNewColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.OldColumn <em>Old Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.OldColumn
   * @generated
   */
  public Adapter createOldColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ColumnSourceRef <em>Column Source Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ColumnSourceRef
   * @generated
   */
  public Adapter createColumnSourceRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.NestedExpression <em>Nested Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.NestedExpression
   * @generated
   */
  public Adapter createNestedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.SelectStatementExpression <em>Select Statement Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.SelectStatementExpression
   * @generated
   */
  public Adapter createSelectStatementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.CaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.CaseExpression
   * @generated
   */
  public Adapter createCaseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.CastExpression
   * @generated
   */
  public Adapter createCastExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.FunctionArgument <em>Function Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.FunctionArgument
   * @generated
   */
  public Adapter createFunctionArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.SelectCore <em>Select Core</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.SelectCore
   * @generated
   */
  public Adapter createSelectCoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.SelectExpression <em>Select Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.SelectExpression
   * @generated
   */
  public Adapter createSelectExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.SingleSourceTable <em>Single Source Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.SingleSourceTable
   * @generated
   */
  public Adapter createSingleSourceTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.SingleSourceSelectStatement <em>Single Source Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.SingleSourceSelectStatement
   * @generated
   */
  public Adapter createSingleSourceSelectStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ResultColumn <em>Result Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ResultColumn
   * @generated
   */
  public Adapter createResultColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.NumericLiteral
   * @generated
   */
  public Adapter createNumericLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.NullLiteral
   * @generated
   */
  public Adapter createNullLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.CurrentTimeLiteral <em>Current Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.CurrentTimeLiteral
   * @generated
   */
  public Adapter createCurrentTimeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.CurrentDateLiteral <em>Current Date Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.CurrentDateLiteral
   * @generated
   */
  public Adapter createCurrentDateLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.CurrentTimeStampLiteral <em>Current Time Stamp Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.CurrentTimeStampLiteral
   * @generated
   */
  public Adapter createCurrentTimeStampLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.CreateTableStatement <em>Create Table Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.CreateTableStatement
   * @generated
   */
  public Adapter createCreateTableStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.CreateViewStatement <em>Create View Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.CreateViewStatement
   * @generated
   */
  public Adapter createCreateViewStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.AlterTableRenameStatement <em>Alter Table Rename Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.AlterTableRenameStatement
   * @generated
   */
  public Adapter createAlterTableRenameStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ColumnDef <em>Column Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ColumnDef
   * @generated
   */
  public Adapter createColumnDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.PrimaryKeyColumnConstraint <em>Primary Key Column Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.PrimaryKeyColumnConstraint
   * @generated
   */
  public Adapter createPrimaryKeyColumnConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.NotNullConstraint <em>Not Null Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.NotNullConstraint
   * @generated
   */
  public Adapter createNotNullConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.UniqueConstraint <em>Unique Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.UniqueConstraint
   * @generated
   */
  public Adapter createUniqueConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.DefaultConstraint <em>Default Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.DefaultConstraint
   * @generated
   */
  public Adapter createDefaultConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.CheckConstraint <em>Check Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.CheckConstraint
   * @generated
   */
  public Adapter createCheckConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.LiteralDefaultValue <em>Literal Default Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.LiteralDefaultValue
   * @generated
   */
  public Adapter createLiteralDefaultValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.justeat.mickeydb.mickeyLang.ExpressionDefaultValue <em>Expression Default Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.justeat.mickeydb.mickeyLang.ExpressionDefaultValue
   * @generated
   */
  public Adapter createExpressionDefaultValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MickeyLangAdapterFactory