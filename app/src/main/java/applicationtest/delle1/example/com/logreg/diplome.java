package applicationtest.delle1.example.com.logreg;

import android.app.DownloadManager;
import android.content.Context;
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


public class diplome extends AppCompatActivity {
    Button downloadButton,btn1;
    DownloadManager downloadManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diplome);
        downloadButton = (Button) findViewById(R.id.downloadbutton);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri url=Uri.parse("https://hafida19.000webhostapp.com/Certificat de réussite 2019.pdf");
                DownloadManager.Request request=new DownloadManager.Request(url);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        btn1 = findViewById(R.id.downloadbutton1) ;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn1();
            }
        });


    }
    public void openBtn1(){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:" + "elaboui.hafida@gmail.com"));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Certificat ");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Nom :" +
                "prenom:" +
                "Email:(envoyer un email corret(e)");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send email using..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(diplome.this, "No email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
}

