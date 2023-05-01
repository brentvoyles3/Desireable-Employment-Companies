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


public class ChildActivity extends AppCompatActivity {
    private ImageView ImageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        Intent intent = getIntent();

        ImageView = (ImageView) findViewById(R.id.imageView);
        ImageView.setImageResource(R.drawable.google);

        textView = (TextView) findViewById(R.id.textView2);

        InputStream inputStream = this.getResources().openRawResource( R.raw.google);
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream) );

        StringBuffer stringBuffer = new StringBuffer();
        String strData = "";

        if (inputStream != null) {
            try {
                while ((strData = bufferedReader.readLine()) != null) {
                    stringBuffer.append( strData + "\n");
                }
                textView.setText(stringBuffer);
            } catch (Exception err) {
                err.printStackTrace();
            } // catch
        } // if
    } // onCreate

    public static Intent createIntent(Context context) {
        return new Intent(context, ChildActivity.class);
    } //createIntent
}