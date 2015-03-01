package com.justeat.mickeydb;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.justeat.mickeydb.ModelUtil;
import com.justeat.mickeydb.mickeyLang.AlterTableAddColumnStatement;
import com.justeat.mickeydb.mickeyLang.ColumnSourceRef;
import com.justeat.mickeydb.mickeyLang.CreateTriggerStatement;
import com.justeat.mickeydb.mickeyLang.DMLStatement;
import com.justeat.mickeydb.mickeyLang.DropTriggerStatement;
import com.justeat.mickeydb.mickeyLang.DropViewStatement;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;
import com.justeat.mickeydb.mickeyLang.Model;
import com.justeat.mickeydb.mickeyLang.NewColumn;
import com.justeat.mickeydb.mickeyLang.OldColumn;
import com.justeat.mickeydb.mickeyLang.SelectExpression;
import com.justeat.mickeydb.mickeyLang.SelectSource;
import com.justeat.mickeydb.mickeyLang.SingleSource;
import com.justeat.mickeydb.mickeyLang.SingleSourceTable;
import com.justeat.mickeydb.mickeyLang.UpdateColumnExpression;
import com.justeat.mickeydb.mickeyLang.UpdateStatement;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MickeyScopeProvider extends AbstractDeclarativeScopeProvider {
  @Inject
  private IQualifiedNameProvider nameProvider;
  
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xifexpression = null;
    boolean _and = false;
    if (!(context instanceof Model)) {
      _and = false;
    } else {
      boolean _equals = Objects.equal(reference, null);
      _and = _equals;
    }
    if (_and) {
      _xifexpression = this.delegateGetScope(context, MickeyLangPackage.Literals.MODEL__BLOCKS);
    } else {
      _xifexpression = super.getScope(context, reference);
    }
    return _xifexpression;
  }
  
  public IScope scope_AlterTableAddColumnStatement_table(final AlterTableAddColumnStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      Model model = ModelUtil.getModel(context);
      String tableName = ModelUtil.getFeatureNodeText(context, ref);
      String _databaseName = model.getDatabaseName();
      QualifiedName _create = QualifiedName.create(_databaseName, tableName);
      Iterable<IEObjectDescription> _elements = scope.getElements(_create);
      final Function1<IEObjectDescription, EObject> _function = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_elements, _function);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_SingleSourceTable_tableReference(final SingleSourceTable context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      Model model = ModelUtil.getModel(context);
      String tableName = ModelUtil.getFeatureNodeText(context, ref);
      String _databaseName = model.getDatabaseName();
      QualifiedName _create = QualifiedName.create(_databaseName, tableName);
      Iterable<IEObjectDescription> _elements = scope.getElements(_create);
      final Function1<IEObjectDescription, EObject> _function = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_elements, _function);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_ColumnSourceRef_column(final ColumnSourceRef context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      Model model = ModelUtil.getModel(context);
      SelectExpression selectExpression = ModelUtil.<SelectExpression>getAncestorOfType(context, SelectExpression.class);
      String tableName = "";
      boolean _notEquals = (!Objects.equal(selectExpression, null));
      if (_notEquals) {
        SelectSource _source = context.getSource();
        String _featureNodeText = ModelUtil.getFeatureNodeText(_source, MickeyLangPackage.Literals.SINGLE_SOURCE_TABLE__TABLE_REFERENCE);
        tableName = _featureNodeText;
      } else {
        UpdateStatement updateStatement = ModelUtil.<UpdateStatement>getAncestorOfType(context, UpdateStatement.class);
        boolean _notEquals_1 = (!Objects.equal(updateStatement, null));
        if (_notEquals_1) {
          String _featureNodeText_1 = ModelUtil.getFeatureNodeText(updateStatement, MickeyLangPackage.Literals.UPDATE_STATEMENT__TABLE);
          tableName = _featureNodeText_1;
        }
      }
      String _databaseName = model.getDatabaseName();
      final QualifiedName name = QualifiedName.create(_databaseName, tableName);
      Iterable<IEObjectDescription> _allElements = scope.getAllElements();
      final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
        public Boolean apply(final IEObjectDescription e) {
          QualifiedName _name = e.getName();
          return Boolean.valueOf(_name.startsWith(name));
        }
      };
      Iterable<IEObjectDescription> _filter = IterableExtensions.<IEObjectDescription>filter(_allElements, _function);
      final Function1<IEObjectDescription, EObject> _function_1 = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_filter, _function_1);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_NewColumn_column(final NewColumn context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      Model model = ModelUtil.getModel(context);
      CreateTriggerStatement statement = ModelUtil.<CreateTriggerStatement>getAncestorOfType(context, CreateTriggerStatement.class);
      String tableName = ModelUtil.getFeatureNodeText(statement, MickeyLangPackage.Literals.CREATE_TRIGGER_STATEMENT__TABLE);
      String _databaseName = model.getDatabaseName();
      final QualifiedName name = QualifiedName.create(_databaseName, tableName);
      Iterable<IEObjectDescription> _allElements = scope.getAllElements();
      final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
        public Boolean apply(final IEObjectDescription e) {
          QualifiedName _name = e.getName();
          return Boolean.valueOf(_name.startsWith(name));
        }
      };
      Iterable<IEObjectDescription> _filter = IterableExtensions.<IEObjectDescription>filter(_allElements, _function);
      final Function1<IEObjectDescription, EObject> _function_1 = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_filter, _function_1);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_OldColumn_column(final OldColumn context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      Model model = ModelUtil.getModel(context);
      CreateTriggerStatement statement = ModelUtil.<CreateTriggerStatement>getAncestorOfType(context, CreateTriggerStatement.class);
      String tableName = ModelUtil.getFeatureNodeText(statement, MickeyLangPackage.Literals.CREATE_TRIGGER_STATEMENT__TABLE);
      String _databaseName = model.getDatabaseName();
      final QualifiedName name = QualifiedName.create(_databaseName, tableName);
      Iterable<IEObjectDescription> _allElements = scope.getAllElements();
      final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
        public Boolean apply(final IEObjectDescription e) {
          QualifiedName _name = e.getName();
          return Boolean.valueOf(_name.startsWith(name));
        }
      };
      Iterable<IEObjectDescription> _filter = IterableExtensions.<IEObjectDescription>filter(_allElements, _function);
      final Function1<IEObjectDescription, EObject> _function_1 = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_filter, _function_1);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_UpdateColumnExpression_columnName(final UpdateColumnExpression context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      Model model = ModelUtil.getModel(context);
      DMLStatement statement = ModelUtil.<DMLStatement>getAncestorOfType(context, DMLStatement.class);
      String tableName = ModelUtil.getTargetTableName(statement);
      String _databaseName = model.getDatabaseName();
      final QualifiedName name = QualifiedName.create(_databaseName, tableName);
      Iterable<IEObjectDescription> _allElements = scope.getAllElements();
      final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
        public Boolean apply(final IEObjectDescription e) {
          QualifiedName _name = e.getName();
          return Boolean.valueOf(_name.startsWith(name));
        }
      };
      Iterable<IEObjectDescription> _filter = IterableExtensions.<IEObjectDescription>filter(_allElements, _function);
      final Function1<IEObjectDescription, EObject> _function_1 = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_filter, _function_1);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_ColumnSourceRef_source(final ColumnSourceRef context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      SelectExpression select = ModelUtil.<SelectExpression>getAncestorOfType(context, SelectExpression.class);
      ArrayList<SingleSource> _findAllSingleSources = ModelUtil.findAllSingleSources(select);
      _xblockexpression = Scopes.scopeFor(_findAllSingleSources, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_DropViewStatement_view(final DropViewStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      Model model = ModelUtil.getModel(context);
      String viewName = ModelUtil.getFeatureNodeText(context, ref);
      String _databaseName = model.getDatabaseName();
      QualifiedName _create = QualifiedName.create(_databaseName, viewName);
      Iterable<IEObjectDescription> _elements = scope.getElements(_create);
      final Function1<IEObjectDescription, EObject> _function = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_elements, _function);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_DropTriggerStatement_trigger(final DropTriggerStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      Model model = ModelUtil.getModel(context);
      String triggerName = ModelUtil.getFeatureNodeText(context, ref);
      String _databaseName = model.getDatabaseName();
      QualifiedName _create = QualifiedName.create(_databaseName, triggerName);
      Iterable<IEObjectDescription> _elements = scope.getElements(_create);
      final Function1<IEObjectDescription, EObject> _function = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_elements, _function);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
}
