package applicationtest.delle1.example.com.logreg;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import applicationtest.delle1.example.com.logreg.R;


public class btn5 extends AppCompatActivity {
  Button btn1;
    DownloadManager downloadManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn5);
        btn1 = findViewById(R.id.db) ;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn1();
            }
        });


    }
    public void openBtn1(){
        Intent intent=new Intent(this, diplome.class);
        startActivity(intent);
    }
}

//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//////    class DownloadFile extends AsyncTask<String, Integer, String> {
//////        @Override
//////        protected String doInBackground(String... url) {
//////            int count;
//////            try {
//////                URL add = new URL("http://www.hrupin.com/wp-content/uploads/mp3/testsong_20_sec.mp3");
//////                URLConnection conexion = add.openConnection();
//////                conexion.connect();
//////                // this will be useful so that you can show a tipical 0-100% progress bar
//////                int lenghtOfFile = conexion.getContentLength();
//////
//////                // downlod the file
//////                InputStream input = new BufferedInputStream(add.openStream());
//////                OutputStream output = new FileOutputStream("/sdcard/Download/name.mp3");
//////
//////                byte data[] = new byte[1024];
//////
//////                long total = 0;
//////
//////                while ((count = input.read(data)) != -1) {
//////                    total += count;
//////                    // publishing the progress....
//////                    publishProgress((int) (total * 100 / lenghtOfFile));
//////                    output.write(data, 0, count);
//////                }
//////
//////                output.flush();
//////                output.close();
//////                input.close();
//////            } catch (Exception e) {
//////            }
//////            return null;
//////        }
////
////    }
//}