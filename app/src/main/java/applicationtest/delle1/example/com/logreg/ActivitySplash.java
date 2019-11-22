package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class ActivitySplash extends AppCompatActivity {
 private ProgressBar ProgressBar;

    MediaPlayer son;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       // prg=(ProgressBar)findViewById(R.id.progress);
       // btn=(Button) findViewById(R.id.button);
               // prg.setProgress(100);
init();
        son= MediaPlayer.create(ActivitySplash.this,R.raw.s2);
        son.start();
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    ProgressBar.setVisibility(View.VISIBLE);
                    sleep(4000);
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    son.release();
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
    private  void init(){
        this.ProgressBar=findViewById(R.id.progressBar);
    }
}