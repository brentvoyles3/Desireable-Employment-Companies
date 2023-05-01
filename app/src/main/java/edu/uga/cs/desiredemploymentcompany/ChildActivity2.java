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

public class ChildActivity2 extends AppCompatActivity {
    private ImageView ImageViewAAPL;
    private TextView textViewAAPL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child2);

        Intent intent = getIntent();

        ImageViewAAPL = (ImageView) findViewById(R.id.imageViewM);
        ImageViewAAPL.setImageResource(R.drawable.apple);

        textViewAAPL = (TextView) findViewById(R.id.textViewA);

        InputStream inputStream = this.getResources().openRawResource( R.raw.apple);
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream) );

        StringBuffer stringBuffer = new StringBuffer();
        String strData = "";

        if (inputStream != null) {
            try {
                while ((strData = bufferedReader.readLine()) != null) {
                    stringBuffer.append( strData + "\n");
                }
                textViewAAPL.setText(stringBuffer);
            } catch (Exception err) {
                err.printStackTrace();
            } // catch
        } // if
    } // onCreate

    public static Intent createIntent(Context context) {
        return new Intent(context, ChildActivity2.class);
    } //createIntent
}

