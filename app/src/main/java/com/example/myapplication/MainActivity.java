package com.example.myapplication;

import android.os.Bundle;

import com.example.myapplication.ui.admin.AdminFragment;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMainFragment();
    }

    private void showMainFragment() {
        if(getSupportFragmentManager().getFragments().size() == 0){
            getSupportFragmentManager().beginTransaction()
                    .replace(
                            R.id.fragment_container_view_tag,
                            new AdminFragment(),
                            "LoginFragment"
                    ).commit();
        }
    }
}