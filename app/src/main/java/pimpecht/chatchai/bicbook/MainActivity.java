package pimpecht.chatchai.bicbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }// mmain Method

    public void clickSignUpMain(View View) {
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));


    }

}// Main Class
