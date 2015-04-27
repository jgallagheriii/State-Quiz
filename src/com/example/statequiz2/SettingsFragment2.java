package com.example.statequiz2;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingsFragment2 extends PreferenceFragment
{   
   // creates preferences GUI from preferences.xml file in res/xml
   @Override
   public void onCreate(Bundle savedInstanceState) 
   {
      super.onCreate(savedInstanceState);
      addPreferencesFromResource(R.xml.preferences); // load from XML
   } 
} // end class SettingsFragment