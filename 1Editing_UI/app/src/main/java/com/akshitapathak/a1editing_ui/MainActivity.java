package com.akshitapathak.a1editing_ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        //Initialise my text view using its id
        TextView myTextView=findViewById(R.id.textViewId);
        myTextView.setText("Hola Akshita!");

        //Initialise my edit view using its id
        EditText myEditView=findViewById(R.id.editViewId);
        String inputText=myEditView.getText().toString();

        //Initialise button using its id
        Button myBtn=findViewById(R.id.btnId);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked me!", Toast.LENGTH_SHORT).show();
            }
        });
    }


}