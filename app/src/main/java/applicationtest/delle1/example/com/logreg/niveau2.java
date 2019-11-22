package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


public class niveau2 extends AppCompatActivity {
    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveau2);
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
    }

    public void openBtn1(){
        Intent intent=new Intent(this, t111.class);
        startActivity(intent);
    }
    public void openBtn2(){
        Intent intent=new Intent(this, t222.class);
        startActivity(intent);
    }
    public void openBtn3(){
        Intent intent=new Intent(this, t333.class);
        startActivity(intent);
    }
    public void openBtn4(){
        Intent intent=new Intent(this, btn1.class);
        startActivity(intent);
    }
}
