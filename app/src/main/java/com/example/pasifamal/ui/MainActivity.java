package com.example.pasifamal.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pasifamal.R;
import com.example.pasifamal.ui.RegisterFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentOpen();
    }

    private void fragmentOpen() {
        LoginFragment loginFragment = new LoginFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.host_fragment, loginFragment).commit();
    }
}