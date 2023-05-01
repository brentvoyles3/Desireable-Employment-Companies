package edu.uga.cs.desiredemploymentcompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE_TYPE = "Message";
    private EditText editText;

    private Button startButton;
    private Button startButton2;
    private Button startButton3;
    private Button startButton4;
    private Button startButton5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById( R.id.button);
        startButton2 = findViewById( R.id.button2);
        startButton3 = findViewById( R.id.button3);
        startButton4 = findViewById( R.id.button4);
        startButton5 = findViewById( R.id.button5);

        startButton.setOnClickListener( new
                ButtonClickListener() );
        startButton2.setOnClickListener( new
                ButtonClickListener() );
        startButton3.setOnClickListener( new
                ButtonClickListener() );
        startButton4.setOnClickListener( new
                ButtonClickListener() );
        startButton5.setOnClickListener( new
                ButtonClickListener() );
    }
    private class ButtonClickListener implements
            View.OnClickListener
    {
        @Override
        public void onClick( View view ) {
            Intent intent;
            switch (view.getId()) {
                case R.id.button:
                intent = new Intent(view.getContext(), ChildActivity.class);
                startActivity(intent);
                break;
                case R.id.button2:
                    intent = new Intent(view.getContext(), ChildActivity2.class);
                    startActivity(intent);
                    break;
                case R.id.button3:
                    intent= new Intent(view.getContext(), ChildActivity3.class);
                    startActivity(intent);
                    break;
                case R.id.button4:
                    intent = new Intent(view.getContext(), ChildActivity4.class);
                    startActivity(intent);
                    break;
                case R.id.button5:
                    intent = new Intent(view.getContext(), ChildActivity5.class);
                    startActivity(intent);
                    break;
            }
        }

    }
}