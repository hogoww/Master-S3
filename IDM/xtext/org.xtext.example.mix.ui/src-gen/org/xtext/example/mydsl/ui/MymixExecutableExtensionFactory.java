/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.mix.ui.internal.MixActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MymixExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MixActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MixActivator.getInstance().getInjector(MixActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYMIX);
	}
	
}
