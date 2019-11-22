package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import applicationtest.delle1.example.com.logreg.R;


public class btn4 extends AppCompatActivity {
//Random r;



    private Questiontest mQuestionLibrary = new Questiontest();

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
    //ImageView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn4);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(btn4.this,t1.class));
            }
        });
        mButtonChoice4 = (Button)findViewById(R.id.quit);
        mButtonChoice4.setVisibility(View.GONE);
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
                    Toast.makeText(btn4.this, "correcte", Toast.LENGTH_SHORT).show();
                    son= MediaPlayer.create(btn4.this,R.raw.cor);
                    son.start();

                }else {
                    Toast.makeText(btn4.this, "faux", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(btn4.this, "correcte", Toast.LENGTH_SHORT).show();
                    son= MediaPlayer.create(btn4.this,R.raw.cor);
                    son.start();


                }else {
                    Toast.makeText(btn4.this, "faux", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(btn4.this, "correcte", Toast.LENGTH_SHORT).show();
                    son= MediaPlayer.create(btn4.this,R.raw.cor);
                    son.start();


                }else {
                    Toast.makeText(btn4.this, "faux", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button3





    }
    /*Random r = new Random();
        int randomIndex = r.nextInt(mQuestionNumber-1);
        //t1.setText(randomIndex);
        mQuestionView.setText(randomIndex-1);
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        //mQuestionNumber++;*/

    private void updateQuestion(){
        Random r = new Random();
        int randomIndex = r.nextInt(40);
        if(mQuestionNumber==40) {
           /* mQuestionView.setText(Questiontest.mQuestions[randomIndex]);
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(randomIndex));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(randomIndex));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(randomIndex));

            mAnswer = mQuestionLibrary.getCorrectAnswer(randomIndex);
            mQuestionNumber++;*/
            mQuestionView.setVisibility(View.GONE);
            mButtonChoice1.setVisibility(View.GONE);
            mButtonChoice2.setVisibility(View.GONE);
            mButtonChoice3.setVisibility(View.GONE);
            mButtonChoice4.setVisibility(View.VISIBLE);
        }else
        {
           /* mQuestionView.setVisibility(View.GONE);
            mButtonChoice1.setVisibility(View.GONE);
            mButtonChoice2.setVisibility(View.GONE);
            mButtonChoice3.setVisibility(View.GONE);*/
            mQuestionView.setText(Questiontest.mQuestions[randomIndex]);
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(randomIndex));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(randomIndex));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(randomIndex));

            mAnswer = mQuestionLibrary.getCorrectAnswer(randomIndex);
            mQuestionNumber++;
        }



    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
    public void openBtn1(){
        if(mScore==20){
        Intent intent=new Intent(this, btn5.class);
            mButtonChoice4.setVisibility(View.VISIBLE);
        startActivity(intent);}else{
            Intent intent=new Intent(this, Accueil.class);
            startActivity(intent);
        }
    }

}
