package com.akshitapathak.a6unit_converter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputKgs=findViewById(R.id.myInputId);
        Button btn=findViewById(R.id.myBtnId);
        TextView outputPounds=findViewById(R.id.poundsId);

        //Convert kilos to pounds
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String kilograms=inputKgs.getText().toString();
                //int kgs=Integer.parseInt(kilograms);
                int kgs=Integer.parseInt(inputKgs.getText().toString());
                outputPounds.setText(""+convertKgsToPounds(kgs));
            }
        });
    }

    public double convertKgsToPounds(int kilogram){
        return (double)2.20462*kilogram;
    }
}