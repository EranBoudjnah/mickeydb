/*
 * generated by Xtext
 */
package com.justeat.mickeydb;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class MickeyLangRuntimeModule extends com.justeat.mickeydb.AbstractMickeyLangRuntimeModule {
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return MickeyNameProvider.class;
    }
    
    @Override
    public Class<? extends IScopeProvider> bindIScopeProvider() {
    	return MickeyScopeProvider.class;
    }

}
