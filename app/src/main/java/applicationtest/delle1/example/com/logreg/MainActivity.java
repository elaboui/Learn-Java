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

public class MainActivity extends AppCompatActivity {

    EditText username , pwd ;
    Button log , reg ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username) ;
        pwd =findViewById(R.id.pwd) ;
        log = findViewById(R.id.log) ;
        reg = findViewById(R.id.reg) ;

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String pseudo =username.getText().toString() ;
                String pw = pwd.getText().toString() ;

                String url_insert = "https://hafida19.000webhostapp.com/registration/login.php?pseudo="+pseudo+"&password="+pw;
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                StringRequest request = new StringRequest(Request.Method.GET, url_insert, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.equals("existe")){
                            Intent intent = new Intent(MainActivity.this , Accueil.class) ;
                            intent.putExtra("pseudo" ,pseudo) ;
                            startActivity(intent);
                        }
                        else Toast.makeText(MainActivity.this , response ,Toast.LENGTH_LONG).show();

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this , "Erreur" ,Toast.LENGTH_LONG).show();
                    }
                });
                queue.add(request) ;
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Registration.class) ;
                startActivity(intent);
            }
        });

    }
}
