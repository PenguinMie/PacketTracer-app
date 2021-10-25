package com.example.design;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class NETWORKING_COMMAND extends AppCompatActivity {

    private Button btnnnatbutton, btneigrpbutton, btnaclbutton, btndhcpbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_networking_command);

        initViews();

        btndhcpbutton.setOnClickListener(v -> {
            Intent intent = new Intent(NETWORKING_COMMAND.this, Dhcp.class);
            startActivity(intent);
        });

        btnnnatbutton.setOnClickListener(v -> {
            Intent intent = new Intent(NETWORKING_COMMAND.this, Nat.class);
            startActivity(intent);
        });

        btneigrpbutton.setOnClickListener(v -> {
            Intent intent = new Intent(NETWORKING_COMMAND.this, Eigrp.class);
            startActivity(intent);
        });

        btnaclbutton.setOnClickListener(v -> {
            Intent intent = new Intent(NETWORKING_COMMAND.this, Acl.class);
            startActivity(intent);
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void initViews() {

        btndhcpbutton = findViewById(R.id.btndhcpbutton);
        btnnnatbutton = findViewById(R.id.btnnatbutton);
        btneigrpbutton = findViewById(R.id.btneigrpbutton);
        btnaclbutton = findViewById(R.id.btnaclbutton);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
