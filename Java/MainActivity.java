package com.cs2415.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=findViewById(R.id.toggleButton);
        txt1=findViewById(R.id.txt1);
        txt1.setText("Off");
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toggleButton.isChecked())
                {
                    txt1.setText("On");
                }
                else {
                    txt1.setText("Off");
                }
            }
        });
    }
}
