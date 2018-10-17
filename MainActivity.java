package com.example.chinky.checkscore;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button plus,minus,plus2,minus2,plus3,minus3,plus4,minus4,plus5,minus5,plus6,minus6,getTotal;
    public int total_scorefinal=0,quantity,quantity2,quantity3,quantity4,quantity5,quantity6,total_score, total_score2 ,total_score3,total_score4,total_score5,total_score6;
public TextView show_quant,show_quant2,show_quant3,show_quant4,show_quant5,show_quant6,result;
public int single=1,double1=2,six=6,four=4,no_ball=1,wide=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus=findViewById(R.id.plus1);
        minus=findViewById(R.id.minus);
        plus2=findViewById(R.id.plus2);
        minus2=findViewById(R.id.minus2);
        plus3=findViewById(R.id.plus3);
        minus3=findViewById(R.id.minus3);
        plus4=findViewById(R.id.plus4);
        minus4=findViewById(R.id.minus4);
        plus5=findViewById(R.id.plus5);
        minus5=findViewById(R.id.minus5);
        plus6=findViewById(R.id.plus6);
        minus6=findViewById(R.id.minus6);
        getTotal=findViewById(R.id.total);

        result=findViewById(R.id.res);
        show_quant=findViewById(R.id.quant);
        show_quant2=findViewById(R.id.quant2);
        show_quant3=findViewById(R.id.quant3);
        show_quant4=findViewById(R.id.quant4);
        show_quant5=findViewById(R.id.quant5);
        show_quant6=findViewById(R.id.quant6);




        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity<=0){
                    quantity=0;
                    Toast.makeText(MainActivity.this, "Value cannot be less than 0", Toast.LENGTH_SHORT).show();
                }
                else {
                    --quantity;
                    show_quant.setText(quantity);
                }
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity>=10){
                    quantity=10;
                    Toast.makeText(MainActivity.this, "Limit reached", Toast.LENGTH_SHORT).show();
                }
                else{
                    quantity++;
                    show_quant.setText(quantity);
                }
            }
        });
        total_score = quantity * single;


        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity2<=0){
                    quantity2=0;
                    Toast.makeText(MainActivity.this, "Value cannot be less than 0", Toast.LENGTH_SHORT).show();
                }
                else {
                    --quantity2;
                    show_quant2.setText(quantity2);
                }
            }
        });


        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity2>=10){
                    quantity2=10;
                    Toast.makeText(MainActivity.this, "Limit reached", Toast.LENGTH_SHORT).show();
                }
                else{
                    quantity2++;
                    show_quant2.setText(quantity2);
                }
            }
        });

        total_score2 = quantity2 * double1;


        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity3<=0){
                    quantity3=0;
                    Toast.makeText(MainActivity.this, "Value cannot be less than 0", Toast.LENGTH_SHORT).show();
                }
                else {
                    --quantity3;
                    show_quant3.setText(quantity3);
                }
            }
        });


        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity3>=10){
                    quantity3=10;
                    Toast.makeText(MainActivity.this, "Limit reached", Toast.LENGTH_SHORT).show();
                }
                else{
                    quantity3++;
                    show_quant3.setText(quantity3);
                }
            }
        });
        total_score3 = quantity3 * four;


        minus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity4<=0){
                    quantity4=0;
                    Toast.makeText(MainActivity.this, "Value cannot be less than 0", Toast.LENGTH_SHORT).show();
                }
                else {
                    --quantity4;
                    show_quant4.setText(quantity4);
                }
            }
        });


        plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity4>=10){
                    quantity4=10;
                    Toast.makeText(MainActivity.this, "Limit reached", Toast.LENGTH_SHORT).show();
                }
                else{
                    quantity4++;
                    show_quant4.setText(quantity4);
                }
            }
        });

        total_score4 = quantity4 * six;


        minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity5<=0){
                    quantity5=0;
                    Toast.makeText(MainActivity.this, "Value cannot be less than 0", Toast.LENGTH_SHORT).show();
                }
                else {
                    --quantity5;
                    show_quant5.setText(quantity5);
                }
            }
        });


        plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity5>=10){
                    quantity5=10;
                    Toast.makeText(MainActivity.this, "Limit reached", Toast.LENGTH_SHORT).show();
                }
                else{
                    quantity5++;
                    show_quant5.setText(quantity5);
                }
            }
        });
        total_score5 = quantity5 * no_ball;


        minus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity6<=0){
                    quantity6=0;
                    Toast.makeText(MainActivity.this, "Value cannot be less than 0", Toast.LENGTH_SHORT).show();
                }
                else {
                    --quantity6;
                    show_quant6.setText(quantity6);
                }
            }
        });


        plus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity6>=40){
                    quantity6=40;
                    Toast.makeText(MainActivity.this, "Limit reached", Toast.LENGTH_SHORT).show();
                }
                else{
                    quantity6++;
                    show_quant6.setText(quantity6);
                }
            }
        });
        total_score6 = quantity6 * wide;






        getTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    total_scorefinal=total_score+total_score2+total_score2+total_score3+total_score4+total_score5+total_score6;

                result.setText("The total score is "+total_scorefinal);
            }
        });

    }
}
