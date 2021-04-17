package com.example.pirmasmingailesdarbas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;

    Button Btncolor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain=findViewById(R.id.tvMain);
        this.Btncolor=findViewById(R.id.Btncolor);
    }
    public void OnBtnclick(View view){
        this.tvMain.setText(R.string.changed_label_captions);
    }
    public void OnBtncolor(View view) {
        this.Btncolor.setText("Spalva pasikeitė");
        this.Btncolor.setTextColor(Color.GREEN);
        this.tvMain.setTextColor(Color.RED);
    }
}
