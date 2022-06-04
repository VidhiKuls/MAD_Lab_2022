package com.example.a201b361_sharing_preferences;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TV;
    SharedPreferences sharedPreferences;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.eng:
                TV.setText("English");
                sharedPreferences.edit().putString("title","English").apply();
                return true;
            case R.id.hin:
                TV.setText("Hindi");
                sharedPreferences.edit().putString("title","Hindi").apply();
                return true;
            default:
                return true;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TV=findViewById(R.id.TV);
        sharedPreferences=this.getSharedPreferences("com.example.a201b361_sharing_preferences",0);
        String pref=sharedPreferences.getString("title","null");
        TV.setText(pref);
    }
}
