package com.example.latihanandroid2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText et1, et2, et3;
    Button btn1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, telp;
                email = et1.getText().toString();
                telp = et2.getText().toString();

                if (email.equals("") || telp.equals("")) {
                    Toast.makeText(LoginActivity.this, "Ada data yang kosong!", Toast.LENGTH_SHORT).show();
                } else {
                    if (!email.equals("erdin@gmail.com")) {
                        Toast.makeText(LoginActivity.this, "Email tidak terdaftar", Toast.LENGTH_SHORT).show();
                    } else {
                        final AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                        dialog.
                                setTitle("Welcome").
                                setCancelable(false).
                                setMessage("Hai " + email).
                                setPositiveButton("Next", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        String email, telp;
                                        int sepatu;
                                        email = et1.getText().toString();
                                        telp = et2.getText().toString();
                                        sepatu = Integer.parseInt(et3.getText().toString());
                                        Bundle i = new Bundle();
                                        i.putString("email", email);
                                        i.putString("telp", telp);
                                        i.putInt("sepatu", sepatu);
                                        Intent b = new Intent(LoginActivity.this, LoginBerhasil.class);
                                        b.putExtras(i);
                                        startActivity(b);
                                        finish();
                                    }
                                }).show();
                    }
                }
            }
        });
    }
}
