/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl;

import org.xtext.example.mydsl.MymixStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MymixStandaloneSetup extends MymixStandaloneSetupGenerated {
  public static void doSetup() {
    MymixStandaloneSetup _mymixStandaloneSetup = new MymixStandaloneSetup();
    _mymixStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
