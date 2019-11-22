package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class t111 extends AppCompatActivity {
    TextView textView;
    Button b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t111);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

        textView= (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());





    }

    public void openBtn2(){
        Intent intent=new Intent(this, quiz111.class);
        startActivity(intent);
    }
    public void openBtn3(){
        Intent intent=new Intent(this, t222.class);
        startActivity(intent);
    }

}
