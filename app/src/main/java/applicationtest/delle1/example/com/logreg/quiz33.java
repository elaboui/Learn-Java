package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class quiz33 extends Activity {

 /*Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

    private Question33 mQuestionLibrary = new Question33();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    MediaPlayer son;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(quiz33.this,t33.class));
            }
        });
        mButtonChoice4 = (Button)findViewById(R.id.quit);
        //mButtonChoice1.setVisibility(View.GONE);
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn1();
            }
        });
        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here
                // mButtonChoice1.setVisibility(View.VISIBLE);
                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(quiz33.this, "correcte", Toast.LENGTH_SHORT).show();
                    son= MediaPlayer.create(quiz33.this,R.raw.cor);
                    son.start();



                }else {
                    Toast.makeText(quiz33.this, "Faux", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(quiz33.this, "correcte", Toast.LENGTH_SHORT).show();
                    son= MediaPlayer.create(quiz33.this,R.raw.cor);
                    son.start();

                }else {
                    Toast.makeText(quiz33.this, "Faux", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(quiz33.this, "correcte", Toast.LENGTH_SHORT).show();
                    son= MediaPlayer.create(quiz33.this,R.raw.cor);
                    son.start();

                }else {
                    Toast.makeText(quiz33.this, "Faux", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button3





    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
        if(mQuestionNumber==2){
            mButtonChoice1.setVisibility(View.GONE);
            mButtonChoice2.setVisibility(View.GONE);
            mButtonChoice3.setVisibility(View.GONE);

        }
    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
    public void openBtn1(){
        Intent intent=new Intent(this, t33.class);
        startActivity(intent);
    }
}
