// SettingsActivity.java
// Activity to display SettingsFragment on a phone
package net.cloud95.android.lession.flagquiz;

import android.app.Activity;
import android.os.Bundle;

public class SettingsActivity extends Activity
{
   // use FragmentManager to display SettingsFragment
   @Override
   protected void onCreate(Bundle savedInstanceState) 
   {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_settings);
   }
}