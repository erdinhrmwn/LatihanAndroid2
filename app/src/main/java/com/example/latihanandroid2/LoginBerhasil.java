package com.example.latihanandroid2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class LoginBerhasil extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);

        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        Bundle b = getIntent().getExtras();
        if (b != null) {
            String x = b.getString("email");
            String y = b.getString("telp");
            int z = b.getInt("sepatu");
            tv1.setText("Email : " + x);
            tv2.setText("No Telepon : " + y);
            tv3.setText("No Sepatu : " + z);
        } else {
            Toast.makeText(getApplicationContext(), "Username tidak tersedia", Toast.LENGTH_SHORT).show();
            tv1.setText("Email tidak terdaftar.");
            tv2.setText("");
            tv3.setText("");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.pilihan1: {
                AlertDialog.Builder builder = new AlertDialog.Builder(LoginBerhasil.this);
                builder.setTitle("Your Info").
                        setCancelable(false).
                        setMessage("Ini Info anda").
                        setPositiveButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //
                            }
                        }).show();
            }
            break;
            case R.id.pilihan2: {
                AlertDialog.Builder builder = new AlertDialog.Builder(LoginBerhasil.this);
                builder.setTitle("Warning!").
                        setCancelable(false).
                        setMessage("Apakah anda ingin logout?").
                        setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(LoginBerhasil.this, LoginActivity.class);
                                startActivity(i);
                                finish();
                            }
                        }).
                        setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //
                            }
                        }).show();
            }
            break;
            case R.id.negara: {
                startActivity(new Intent(LoginBerhasil.this, Negara.class));
            }
            break;
            default:
                //
        }
        return super.onOptionsItemSelected(item);
    }
}