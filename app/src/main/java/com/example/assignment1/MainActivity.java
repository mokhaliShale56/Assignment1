package com.example.assignment1;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button answer1,   answer2, answer3
    TextView question, score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        answer1=(Button) findViewById(R.id.answer1);
        answer2=(Button) findViewById(R.id.answer2);
        answer3=(Button) findViewById(R.id.answer3);

      score=TextView) findViewById(R.id.score );
        question =( answer2=(Button) findViewById(R.id.answer2);


        answer3=(Button) findViewById(R.id.answer3);) findViewById(R.id.question);


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(answer1.getText()==nAnswer){
                nScore++;

                updateQuestion(r.netxInt(nQuestionsLength));

                score.setText("score" + nScore);
            }
            else{
                gameOver{};
            }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        private void updateQuestion(int num){
            question.setText(Questions.getQuestion(num));
            question1.setText(nQuestions.getQuestion(num));
            question2.setText(nQuestions.getQuestion(num));
        }
        private void gameOver(){
            AlertDialog.Builder AlertDialogBuilder=new AlertDialog().Builder(MainActivity.this);
            AlertDialogBuilder
                    makeToast(getApplicationContext()," your score is + nScore+ "points", Toast.LENGTH_SHORT);
        }
    }
}