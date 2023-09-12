package com.example.bmi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edt_weight,edt_height_ft,edt_height_in;
    Button btn,clear_btn;
    TextView result;
    LinearLayout color;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_weight=findViewById(R.id.edt_weight);
        edt_height_ft=findViewById(R.id.edt_height_ft);
        edt_height_in=findViewById(R.id.edt_height_in);
        btn=findViewById(R.id.btn);
        result=findViewById(R.id.result);
        color=findViewById(R.id.color);
        clear_btn=findViewById(R.id.clear_btn);


        btn.setOnClickListener(view -> {
            Toast.makeText(this, "shubham", Toast.LENGTH_SHORT).show();
         double wt =Double.parseDouble(edt_weight.getText().toString());
         double ft = Double.parseDouble(edt_height_ft.getText().toString());
         double in = Double.parseDouble(edt_height_in.getText().toString());

         double total_in = ft*12+in;

         double total_cm = total_in*2.53;

         double total_m = total_cm/100;

         double BMI = wt/(total_m*total_m);

         if(BMI>25){

//             result.setText("You are Over Weight!");
//             color.setBackgroundColor(getResources().getColor( R.color.red));
             Toast.makeText(this, "shubham", Toast.LENGTH_SHORT).show();

         } else if(BMI<18){

             result.setText("You are Under Weight!");
             color.setBackgroundColor(getResources().getColor(R.color.orange));

         }else{

             result.setText("You are Healthy!");
              color.setBackgroundColor(getResources().getColor(R.color.green));

         }

        });

        clear_btn.setOnClickListener(v -> {

            edt_weight.setText("");
            edt_height_ft.setText("");
            edt_height_in.setText("");
            result.setText("");
            color.setBackgroundColor(getResources().getColor(R.color.white));
        });





    }
}