package com.example.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Login");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

            switch (item.getItemId()){
                case R.id.menuSplash:
                    Toast.makeText(this,"Splash Clicked",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.menuLogin:
                    Toast.makeText(this,"Login Clicked",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.menuAbout:
                    Toast.makeText(this,"About Clicked",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.menuContactUs:
                    Toast.makeText(this,"Contact Clicked",Toast.LENGTH_SHORT).show();
                    break;
            }
        return super.onOptionsItemSelected(item);
    }
}
