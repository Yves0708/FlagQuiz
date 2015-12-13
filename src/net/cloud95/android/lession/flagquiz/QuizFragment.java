// QuizFragment.java
// Contains the Flag Quiz logic
package net.cloud95.android.lession.flagquiz;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class QuizFragment extends Fragment 
{
   // String used when logging error messages
   private static final String TAG = "FlagQuiz Activity";

   private static final int FLAGS_IN_QUIZ = 10; //Number of Quiz
   
   private List<String> fileNameList; // flag file names
   private List<String> quizCountriesList; // countries in current quiz
   private Set<String> regionsSet; // world regions in current quiz
   private String correctAnswer; // correct country for the current flag
   private int totalGuesses; // number of guesses made
   private int correctAnswers; // number of correct guesses
   private int guessRows; // number of rows displaying guess Buttons
   private SecureRandom random; // used to randomize the quiz
   private Handler handler; // used to delay loading next flag
   private Animation shakeAnimation; // animation for incorrect guess
   
   private TextView questionNumberTextView; // shows current question #
   private ImageView flagImageView; // displays a flag
   private LinearLayout[] guessLinearLayouts; // rows of answer Buttons
   private TextView answerTextView; // displays Correct! or Incorrect!
   
   // configures the QuizFragment when its View is created
   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState)
   {
      super.onCreateView(inflater, container, savedInstanceState);    
      View view = inflater.inflate(R.layout.fragment_quiz, container,false);
      
      fileNameList = new ArrayList<String>();
      quizCountriesList = new ArrayList<String>();
      random = new SecureRandom();
      handler = new Handler();
      // load the shake animation that's used for incorrect answers
      // animation repeats 3 times 

      // get references to GUI components

      // configure listeners for the guess Buttons
      // set questionNumberTextView's text
      // returns the fragment's view for display
   } // end method onCreateView
   
   // update guessRows based on value in SharedPreferences
   public void updateGuessRows(SharedPreferences sharedPreferences)
   {
      // get the number of guess buttons that should be displayed
      // hide all guess button LinearLayouts
      // display appropriate guess button LinearLayouts 
   }
   
   // update world regions for quiz based on values in SharedPreferences
   public void updateRegions(SharedPreferences sharedPreferences){
	   regionsSet = sharedPreferences.getStringSet(MainActivity.REGIONS, null);
   }

   // set up and start the next quiz 
   public void resetQuiz() 
   {      
      // use AssetManager to get image file names for enabled regions
         // loop through each region
            // get a list of all flag image files in this region
      // reset the number of correct answers made
      // reset the total number of guesses the user made
      // clear prior list of quiz countries
      

      // add FLAGS_IN_QUIZ random file names to the quizCountriesList

         // get the random file name
         // if the region is enabled and it hasn't already been chosen

      // start the quiz by loading the first flag
   } // end method resetQuiz

   // after the user guesses a correct flag, load the next flag
   private void loadNextFlag() 
   {
      // get file name of the next flag and remove it from the list
      // update the correct answer
      // clear answerTextView 

      // display current question number

      // extract the region from the next image's name

      // use AssetManager to load next image from assets folder
         // get an InputStream to the asset representing the next flag
         // load the asset as a Drawable and display on the flagImageView

      // shuffle file names

      // put the correct answer at the end of fileNameList

      // add 3, 6, or 9 guess Buttons based on the value of guessRows
         // place Buttons in currentTableRow
            // get reference to Button to configure

            // get country name and set it as newGuessButton's text
      
      // randomly replace one Button with the correct answer
      // pick random row
      // pick random column
      // get the row
   } // end method loadNextFlag

   // parses the country flag file name and returns the country name
   private String getCountryName(String name)
   {
   } 
   
   // called when a guess Button is touched
   private OnClickListener guessButtonListener = new OnClickListener() 
   {
      @Override
      public void onClick(View v) 
      {
         // increment number of guesses the user has made
         
         // if the guess is correct
         // increment the number of correct answers

            // display correct answer in green text
            // disable all guess Buttons
            
            // if the user has correctly identified FLAGS_IN_QUIZ flags
               // DialogFragment to display quiz stats and start new quiz
                     // create an AlertDialog and return it
                        // "Reset Quiz" Button                              
                        // end anonymous inner class
                        // end call to setPositiveButton
                        
                        // return the AlertDialog
                     // end method onCreateDialog   
                  // end DialogFragment anonymous inner class
               
               // use FragmentManager to display the DialogFragment
               // answer is correct but quiz is not over 
               // load the next flag after a 1-second delay
               // 2000 milliseconds for 2-second delay
            // guess was incorrect  

            // display "Incorrect!" in red 
      } // end method onClick
   }; // end answerButtonListener

   // utility method that disables all answer Buttons 
   private void disableButtons()
   {
   } 
} // end class FlagQuiz