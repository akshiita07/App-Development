package com.akshitapathak.a5counter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //globa declarations:
    int cntr=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myText=findViewById(R.id.myTextId);
        TextView counter=findViewById(R.id.myCntrId);
        Button myBtn=findViewById(R.id.myBtnId);


        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //increase counter:
                counter.setText(""+incCounter());
            }
        });
    }

    //Define fnc here:
    public int incCounter(){
        cntr+=1;
        return cntr;
    }
}