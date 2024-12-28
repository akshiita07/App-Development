package com.akshitapathak.a4greetings_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

        //Set all views:
        ImageView myImage=findViewById(R.id.myImageId);
        TextView myText=findViewById(R.id.myTextId);
        EditText myInput=findViewById(R.id.myInputId);
        Button myBtn=findViewById(R.id.myBtnId);



        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name=myInput.getText().toString();
                Toast.makeText(MainActivity.this, "Welcome to our app "+user_name+" !", Toast.LENGTH_LONG).show();
            }
        });

    }
}