package com.example.crearunswitchonoff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch aSwitch;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch=findViewById(R.id.switch1);
        textView=findViewById(R.id.txt);

    }
    public void Onclick(View view){
        if(view.getId()==R.id.switch1){
            if(aSwitch.isChecked()){
                textView.setText("Active");
            }else{
                textView.setText("Inactive");
            }
        }
    }
}
