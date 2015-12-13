// SettingsFragment.java
// Subclass of PreferenceFragment for managing app settings
package net.cloud95.android.lession.flagquiz;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingsFragment extends PreferenceFragment
{   
   // creates preferences GUI from preferences.xml file in res/xml
   @Override
   public void onCreate(Bundle savedInstanceState) 
   {
      super.onCreate(savedInstanceState);
      // load from XML,將fragment產生等待程式呼叫
      addPreferencesFromResource(R.xml.preferences);
   } 
}