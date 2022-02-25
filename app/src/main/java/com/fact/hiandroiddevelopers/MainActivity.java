package com.fact.hiandroiddevelopers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);

    }

    public void wordClicked(View textview){
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);


        int multi = Integer.parseInt(num1.getText().toString()) *
                Integer.parseInt(num2.getText().toString());

        text.setText(multi + "");
    }
}
