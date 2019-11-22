package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


public class cours extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        t1 = findViewById(R.id.t1) ;
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn1();
            }
        });
        t2 = findViewById(R.id.t2) ;
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn2();
            }
        });
        t3 = findViewById(R.id.t3) ;
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn3();
            }
        });
        t4 = findViewById(R.id.t4) ;
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn4();
            }
        });
        t5 = findViewById(R.id.t5) ;
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn5();
            }
        });
        t6 = findViewById(R.id.t6) ;
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn6();
            }
        });
        t7 = findViewById(R.id.t7) ;
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn7();
            }
        });
        t8 = findViewById(R.id.t8) ;
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn8();
            }
        });

    }
    public void openBtn1(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.t1.class);
        startActivity(intent);
    }
    public void openBtn2(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.t2.class);
        startActivity(intent);
    }
    public void openBtn3(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.t3.class);
        startActivity(intent);
    }
    public void openBtn4(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.t4.class);
        startActivity(intent);
    }
    public void openBtn5(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.t5.class);
        startActivity(intent);
    }
    public void openBtn6(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.t6.class);
        startActivity(intent);
    }
    public void openBtn7(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.t7.class);
        startActivity(intent);
    }
    public void openBtn8(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.t8.class);
        startActivity(intent);
    }

}
