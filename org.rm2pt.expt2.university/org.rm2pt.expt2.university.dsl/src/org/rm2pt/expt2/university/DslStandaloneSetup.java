/*
 * generated by Xtext 2.25.0
 */
package org.rm2pt.expt2.university;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DslStandaloneSetup extends DslStandaloneSetupGenerated {

	public static void doSetup() {
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
