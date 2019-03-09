package com.example.latihanandroid2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class Negara extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.negara);
        Switch s = findViewById(R.id.switch1);
        Spinner sp = findViewById(R.id.spinner1);
        TextView tv = findViewById(R.id.tv_negara);

        s.setChecked(false);
        if(s.isChecked()){
            sp.setVisibility(View.VISIBLE);
            tv.setVisibility(View.VISIBLE);
        }else{
            sp.setVisibility(View.GONE);
            tv.setVisibility(View.GONE);
        }
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Spinner sp = findViewById(R.id.spinner1);
                TextView tv = findViewById(R.id.tv_negara);
                if(isChecked){
                    sp.setVisibility(View.VISIBLE);
                    tv.setVisibility(View.VISIBLE);
                }else{
                    sp.setVisibility(View.GONE);
                    tv.setVisibility(View.GONE);
                }
            }
        });

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner sp = findViewById(R.id.spinner1);
                TextView tv = findViewById(R.id.tv_negara);
                String x = String.valueOf(sp.getSelectedItem());
                tv.setText(x);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Spinner sp = findViewById(R.id.spinner1);
                TextView tv = findViewById(R.id.tv_negara);
                String x = String.valueOf(sp.getSelectedItem());
                tv.setText(x);
            }
        });
    }
}
