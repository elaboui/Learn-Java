package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class quizmenu2 extends AppCompatActivity {
    Button t1,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizmenu2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        t1 = findViewById(R.id.b1) ;
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn1();
            }
        });
        t2 = findViewById(R.id.b2) ;
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn2();
            }
        });
        t3 = findViewById(R.id.b3) ;
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn3();
            }
        });
        t4 = findViewById(R.id.b4) ;
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn4();
            }
        });
        t5 = findViewById(R.id.b5) ;
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn5();
            }
        });
        t6 = findViewById(R.id.b6) ;
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn6();
            }
        });
        t7 = findViewById(R.id.b7) ;
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn7();
            }
        });
        t8 = findViewById(R.id.b8) ;
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn8();
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + "elaboui.hafida@gmail.com"));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "My email's subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "My email's body");

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send email using..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(quizmenu2.this, "No email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void openBtn1(){
        Intent intent=new Intent(this, quiz11.class);
        startActivity(intent);
    }
    public void openBtn2(){
        Intent intent=new Intent(this, quiz22.class);
        startActivity(intent);
    }
    public void openBtn3(){
        Intent intent=new Intent(this, quiz33.class);
        startActivity(intent);
    }
    public void openBtn4(){
        Intent intent=new Intent(this, quiz44.class);
        startActivity(intent);
    }
    public void openBtn5(){
        Intent intent=new Intent(this, quiz55.class);
        startActivity(intent);
    }
    public void openBtn6(){
        Intent intent=new Intent(this, quiz66.class);
        startActivity(intent);
    }
    public void openBtn7(){
        Intent intent=new Intent(this, quiz77.class);
        startActivity(intent);
    }
    public void openBtn8(){
        Intent intent=new Intent(this, quiz88.class);
        startActivity(intent);
    }


}