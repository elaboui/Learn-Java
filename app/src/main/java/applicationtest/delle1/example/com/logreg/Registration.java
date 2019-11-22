package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Registration extends AppCompatActivity {

    EditText pseudo , mdp , email ;
    Button valider ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        pseudo = findViewById(R.id.pseudo) ;
        mdp = findViewById(R.id.mdp) ;
        email = findViewById(R.id.email) ;
        valider = findViewById(R.id.val) ;
        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String mail = email.getText().toString() ;
                final String pwd = mdp.getText().toString() ;
                final String pseu = pseudo.getText().toString() ;
                String url_insert = "https://hafida19.000webhostapp.com/registration/add.php?pseudo="+pseu+"&password="+pwd+"&email="+mail;
                RequestQueue queue = Volley.newRequestQueue(Registration.this);
                StringRequest request = new StringRequest(Request.Method.GET, url_insert, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Intent intent = new Intent(Registration.this , Accueil.class) ;
                        startActivity(intent);
                        Toast.makeText(Registration.this , response+"" ,Toast.LENGTH_LONG).show();

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Registration.this  ,"Erreur" ,Toast.LENGTH_LONG).show();
                    }
                });
                queue.add(request) ;

            }
        });

    }
}
