package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int numberA = 0, numberB = 0;

    public void reset(View view) {
        numberA = 0;
        numberB = 0;
        setScore(numberA, numberB);
    }

    private void setScore(int numberA, int numberB) {
        TextView textViewA = (TextView) findViewById(R.id.teamAscore);
        textViewA.setText(String.valueOf(numberA));
        TextView textViewB = (TextView) findViewById(R.id.teamBscore);
        textViewB.setText(String.valueOf(numberB));
    }

    public void threeA(View view) {
        numberA += 3;
        setScore(numberA, numberB);
    }

    public void twoA(View view) {
        numberA += 2;
        setScore(numberA, numberB);
    }

    public void threeB(View view) {
        numberB += 3;
        setScore(numberA, numberB);
    }

    public void twoB(View view) {
        numberB += 2;
        setScore(numberA, numberB);
    }

    public void freeThrowA(View view){
        numberA++;
        setScore(numberA,numberB);
    }

    public void freeThrowB(View view){
        numberB++;
        setScore(numberA,numberB);
    }
}