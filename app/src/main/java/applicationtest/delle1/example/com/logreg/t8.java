package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class t8 extends AppCompatActivity {
    TextView textView;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t8);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        b1 = findViewById(R.id.bu1) ;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn1();
            }
        });
        b2 = findViewById(R.id.bu2) ;
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn2();
            }
        });
        b3 = findViewById(R.id.bu3) ;
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn3();
            }
        });

    }
    public void openBtn1(){
        Intent intent=new Intent(this, t7.class);
        startActivity(intent);
    }
    public void openBtn2(){
        Intent intent=new Intent(this, quiz8.class);
        startActivity(intent);
    }
    public void openBtn3(){
        Intent intent=new Intent(this, niveau1.class);
        startActivity(intent);
    }

}
