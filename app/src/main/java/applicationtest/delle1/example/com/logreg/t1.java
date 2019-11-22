package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class t1 extends AppCompatActivity {
    TextView textView;
    Button  b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1);
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
        String text="Bienvenue sur Java ! " +
                "Java est un langage de programmation moderne et de haut niveau conçu par sun Microsystems au début des années 1990 et appartenant actuellement à Oracle " +
                "java est indépendant de la plate-forme, ce qui signifie qu'il vous suffit d'écrire le programme une seule fois pour l'exécuter sur plusieurs plates-formes différentes!Java est portable, robuste et dynamique, avec la capacité de répondre aux besoins de tous les types d'applications.";


        SpannableString spannableString=new SpannableString(text);
        StyleSpan bold=new StyleSpan(Typeface.BOLD);
        StrikethroughSpan mstrink=new StrikethroughSpan();
        ForegroundColorSpan mread=new ForegroundColorSpan(Color.BLUE);
        spannableString.setSpan(mread,0,21,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(bold,0,21,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(mread,41,44,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(mread,221,250,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(mread,387,406,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(mread,409,418,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView= (TextView) findViewById(R.id.textt);
        textView.setMovementMethod(new ScrollingMovementMethod());
        String textt="(!) Java garantit que vous ne pourrez écrire qu'une fois, Run Anywhere.";

        SpannableString spannableString1=new SpannableString(textt);
        StyleSpan bold1=new StyleSpan(Typeface.BOLD);
        StrikethroughSpan mstrink1=new StrikethroughSpan();
        ForegroundColorSpan mread1=new ForegroundColorSpan(Color.BLACK);
        spannableString.setSpan(mread,0,4,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(bold,0,4,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);
        textView.setText(spannableString1);

    }

    public void openBtn2(){
        Intent intent=new Intent(this, quiz1.class);
        startActivity(intent);
    }
    public void openBtn3(){
        Intent intent=new Intent(this, t2.class);
        startActivity(intent);
    }

}
