package com.example.android.cricketscoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    /* Declaring variable for TeamOne score and initializing with zero*/
    int teamOneScore = 0;

    /* Declaring variable for TeamOne wicket and initializing with zero*/
    int teamOneWicket = 0;

    /* Declaring variable for TeamTwo score and initializing with zero*/
    int teamTwoScore = 0;

    /* Declaring variable for TeamTwo wicket and initializing with zero*/
    int teamTwoWicket = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Team One display score method
    public void displayTeamOneScore(int scoreA){
        TextView textView = findViewById(R.id.team_one_score);
        textView.setText(String.valueOf(scoreA));
    }

    //Displaying out value at screen for team one
    public void displayTeamOneWicket(int wicketA){
        TextView textView = findViewById(R.id.team_one_wicket);
        textView.setText(String.valueOf(wicketA));
    }

    // Team one add 1 score method
    public void addOneToTeamOne(View view) {
        teamOneScore += 1;
        displayTeamOneScore(teamOneScore);
    }

    // Team one add 2 score method
    public void addTwoToTeamOne(View view) {
        teamOneScore += 2;
        displayTeamOneScore(teamOneScore);
    }

    // Team one add 3 score method
    public void addThreeToTeamOne(View view) {
        teamOneScore += 3;
        displayTeamOneScore(teamOneScore);
    }

    // Team one add 4 score method
    public void addFourToTeamOne(View view) {
        teamOneScore += 4;
        displayTeamOneScore(teamOneScore);
    }

    // Team one add 6 score method
    public void addSixToTeamOne(View view) {
        teamOneScore += 6;
        displayTeamOneScore(teamOneScore);
    }

    // Team one add single run for wide ball score method
    public void addWideBallRunToTeamOne(View view) {
        teamOneScore += 1;
        displayTeamOneScore(teamOneScore);
    }

    // Team one add single run for No ball score method
    public void addNoBallRunToTeamOne(View view) {
        teamOneScore += 1;
        displayTeamOneScore(teamOneScore);
    }

    //Increasing team one with with 1 on every click on out button
    public void addTeamOneWicket(View view){
        teamOneWicket += 1;
        displayTeamOneWicket(teamOneWicket);
    }


    // Team Two display score method
    public void displayTeamTwoScore(int scoreB){
        TextView textView = findViewById(R.id.team_two_score);
        textView.setText(String.valueOf(scoreB));
    }

    //Displaying wicket on text field
    public void displayTeamTwoWicket(int wicketB){
        TextView textView = findViewById(R.id.team_two_wicket);
        textView.setText(String.valueOf(wicketB));
    }

    // Team two add 1 score method
    public void addOneToTeamTwo(View view) {
        teamTwoScore += 1;
        displayTeamTwoScore(teamTwoScore);
    }

    // Team two add 2 score method
    public void addTwoToTeamTwo(View view) {
        teamTwoScore += 2;
        displayTeamTwoScore(teamTwoScore);
    }

    // Team two add 3 score method
    public void addThreeToTeamTwo(View view) {
        teamTwoScore += 3;
        displayTeamTwoScore(teamTwoScore);
    }

    // Team two add 4 score method
    public void addFourToTeamTwo(View view) {
        teamTwoScore += 4;
        displayTeamTwoScore(teamTwoScore);
    }

    // Team two add 6 score method
    public void addSixToTeamTwo(View view) {
        teamTwoScore += 6;
        displayTeamTwoScore(teamTwoScore);
    }

    // Method in Team two add single score for wide ball
    public void addWideBallRunToTeamTwo(View view) {
        teamTwoScore += 1;
        displayTeamTwoScore(teamTwoScore);
    }

    // Method in Team two to add single score for no ball
    public void addNoBallRunToTeamTwo(View view) {
        teamTwoScore += 1;
        displayTeamTwoScore(teamTwoScore);
    }

    //Adding wicket count for team Two
    public void addTeamTwoWicket(View view){
        teamTwoWicket += 1;
        displayTeamTwoWicket(teamTwoWicket);
    }

    //method for reset values
    public void resetScore(View view)
    {
        teamOneScore = 0;
        teamTwoScore = 0;
        teamOneWicket = 0;
        teamTwoWicket = 0;
        displayTeamOneScore(teamOneScore);
        displayTeamTwoScore(teamTwoScore);
        displayTeamOneWicket(teamOneWicket);
        displayTeamTwoWicket(teamTwoWicket);
        calculateResult("Scores Reset To 0");
    }

    //method for set target for team two on display
    public void setTargetForTeamTwo(View view)
    {
        displayTeamTwoTarget(teamOneScore);
    }

    //method for show target for team two on display
    public void displayTeamTwoTarget(int targetScore)
    {
        TextView textView = findViewById(R.id.targetScoreDisplay);
        textView.setText(String.valueOf(targetScore));
    }

    //method which display winner
    public void declareResult(View view){
        String msgA = "Winner is Team A";
        String msgB = "Winner is Team B";
        String msgTie = "Match tie";
        if(teamOneScore>teamTwoScore) {
//            textView.setText(msgA);
            calculateResult(msgA);
        }
        else if(teamOneScore == teamTwoScore) {
//            textView.setText(msgTie);
            calculateResult(msgTie);
        }
        else {
//            textView.setText(msgB);
            calculateResult(msgB);
        }

    }

    //method setting result value to text field
    public void calculateResult(String s)
    {
        TextView textView = findViewById(R.id.winnerTextView);
        textView.setText(s);
    }
}
