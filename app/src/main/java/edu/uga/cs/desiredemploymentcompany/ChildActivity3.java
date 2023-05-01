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

public class ChildActivity3 extends AppCompatActivity {
    private ImageView ImageViewM;
    private TextView textViewM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child3);

        Intent intent = getIntent();

        ImageViewM = (ImageView) findViewById(R.id.imageViewM);
        ImageViewM.setImageResource(R.drawable.microsoft);

        textViewM = (TextView) findViewById(R.id.textViewM);

        InputStream inputStream = this.getResources().openRawResource( R.raw.microsoft);
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream) );

        StringBuffer stringBuffer = new StringBuffer();
        String strData = "";

        if (inputStream != null) {
            try {
                while ((strData = bufferedReader.readLine()) != null) {
                    stringBuffer.append( strData + "\n");
                }
                textViewM.setText(stringBuffer);
            } catch (Exception err) {
                err.printStackTrace();
            } // catch
        } // if
    } // onCreate

    public static Intent createIntent(Context context) {
        return new Intent(context, ChildActivity3.class);
    } //createIntent
}
