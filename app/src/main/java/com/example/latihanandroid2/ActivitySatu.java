package com.example.latihanandroid2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivitySatu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satu);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);

        // anonymous inner class
        View.OnClickListener pushed = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivitySatu.this, "Tombol 3 terklik", Toast.LENGTH_SHORT).show();
            }
        };

        btn3.setOnClickListener(pushed);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivitySatu.this, "Tombol 4 terklik", Toast.LENGTH_SHORT).show();
            }
        });

        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    //buat method klik
    public void Klik(View v){
        switch (v.getId()){
            case R.id.btn1:{
                Toast.makeText(ActivitySatu.this, "Tombol 1 terklik", Toast.LENGTH_SHORT).show();
            }break;
            case R.id.btn2:{
                Toast.makeText(ActivitySatu.this, "Tombol 2 terklik", Toast.LENGTH_SHORT).show();
            }break;
            default:
                //
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn5:{
                Toast.makeText(ActivitySatu.this, "Tombol 5 terklik", Toast.LENGTH_SHORT).show();
            }break;
            case R.id.btn6:{
                Toast.makeText(ActivitySatu.this, "Tombol 6 terklik", Toast.LENGTH_SHORT).show();
            }break;
            default:
                //
        }
    }
}
