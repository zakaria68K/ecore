/*
 * generated by Xtext 2.32.0
 */
package org.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class JenkinsStandaloneSetup extends JenkinsStandaloneSetupGenerated {

	public static void doSetup() {
		new JenkinsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
