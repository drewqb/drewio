/*
* generated by Xtext
*/
package com.frantz.drewio;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DrewIOStandaloneSetup extends DrewIOStandaloneSetupGenerated{

	public static void doSetup() {
		new DrewIOStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
