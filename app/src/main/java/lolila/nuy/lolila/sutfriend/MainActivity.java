package lolila.nuy.lolila.sutfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // Main Method

    //Get Event From Click Button
    public void clickSignUpMain(View view) {
        startActivity(new Intent(MainActivity.this, SignupActivity.class));
    }

}  // Main class นี่คือ คลาสหลัก
