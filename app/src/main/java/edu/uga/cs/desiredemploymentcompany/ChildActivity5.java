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
public class ChildActivity5 extends AppCompatActivity {
    private ImageView ImageViewAMZN;
    private TextView textViewAMZN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child5);

        Intent intent = getIntent();

        ImageViewAMZN = (ImageView) findViewById(R.id.imageViewAMZN);
        ImageViewAMZN.setImageResource(R.drawable.amazon);

        textViewAMZN = (TextView) findViewById(R.id.textViewAMZN);

        InputStream inputStream = this.getResources().openRawResource( R.raw.amazon);
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream) );

        StringBuffer stringBuffer = new StringBuffer();
        String strData = "";

        if (inputStream != null) {
            try {
                while ((strData = bufferedReader.readLine()) != null) {
                    stringBuffer.append( strData + "\n");
                }
                textViewAMZN.setText(stringBuffer);
            } catch (Exception err) {
                err.printStackTrace();
            } // catch
        } // if
    } // onCreate

    public static Intent createIntent(Context context) {
        return new Intent(context, ChildActivity5.class);
    } //createIntent
}

