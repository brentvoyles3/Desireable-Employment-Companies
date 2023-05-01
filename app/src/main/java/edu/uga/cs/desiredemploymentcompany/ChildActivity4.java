package edu.uga.cs.desiredemploymentcompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
public class ChildActivity4 extends AppCompatActivity {
    private ImageView ImageViewT;
    private TextView textViewT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child4);

        Intent intent = getIntent();

        ImageViewT = (ImageView) findViewById(R.id.imageViewT);
        ImageViewT.setImageResource(R.drawable.tesla);

        textViewT = (TextView) findViewById(R.id.textViewT);

        InputStream inputStream = this.getResources().openRawResource( R.raw.tesla);
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream) );

        StringBuffer stringBuffer = new StringBuffer();
        String strData = "";

        if (inputStream != null) {
            try {
                while ((strData = bufferedReader.readLine()) != null) {
                    stringBuffer.append( strData + "\n");
                }
                textViewT.setText(stringBuffer);
            } catch (Exception err) {
                err.printStackTrace();
            } // catch
        } // if
    } // onCreate

    public static Intent createIntent(Context context) {
        return new Intent(context, ChildActivity4.class);
    } //createIntent
}

