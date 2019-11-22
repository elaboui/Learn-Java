package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import applicationtest.delle1.example.com.logreg.R;

public class Accueil extends AppCompatActivity {

    TextView tv ,btn1,btn2,btn3,btn4,btn5;
    LinearLayout btn11,btn22,btn33,btn44,btn55;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        tv = findViewById(R.id.tv) ;
        Intent intent = getIntent() ;
        tv.setText("Bienvenue à Learn Java");
        btn1 = findViewById(R.id.btn1) ;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn1();
            }
        });
        btn11 = findViewById(R.id.btn11) ;
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn1();
            }
        });
        btn22 = findViewById(R.id.btn22) ;
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn2();
            }
        });
        btn33 = findViewById(R.id.btn33) ;
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn3();
            }
        });
        btn44 = findViewById(R.id.btn44) ;
        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn4();
            }
        });
        btn55 = findViewById(R.id.btn55) ;
        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn5();
            }
        });
        btn2 = findViewById(R.id.btn2) ;
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn2();
            }
        });
        btn3 = findViewById(R.id.btn3) ;
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn3();
            }
        });
        btn4 = findViewById(R.id.btn4) ;
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn4();
            }
        });
        btn5 = findViewById(R.id.btn5) ;
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn5();
            }
        });
    }
    public void openBtn1(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.btn1.class);
        startActivity(intent);
    }
    public void openBtn2(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.btn2.class);
        startActivity(intent);
    }
    public void openBtn3(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.btn3.class);
        startActivity(intent);
    }
    public void openBtn4(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.btn4.class);
        startActivity(intent);
    }
    public void openBtn5(){
        Intent intent=new Intent(this, applicationtest.delle1.example.com.logreg.btn5.class);
        startActivity(intent);
    }
}
