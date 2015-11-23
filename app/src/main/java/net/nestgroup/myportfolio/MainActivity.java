package net.nestgroup.myportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button01Clicked(View v) {
        Toast.makeText(this, "Button Clicked : " + ((Button) v).getText(), Toast.LENGTH_LONG).show();
    }

    public void button02Clicked(View v) {
        Toast.makeText(this, "Button Clicked : " + ((Button) v).getText(), Toast.LENGTH_LONG).show();
    }

    public void button03Clicked(View v) {
        Toast.makeText(this, "Button Clicked : " + ((Button) v).getText(), Toast.LENGTH_LONG).show();
    }

    public void button04Clicked(View v) {
        Toast.makeText(this, "Button Clicked : " + ((Button) v).getText(), Toast.LENGTH_LONG).show();
    }

    public void button05Clicked(View v) {
        Toast.makeText(this, "Button Clicked : " + ((Button) v).getText(), Toast.LENGTH_LONG).show();
    }

    public void button06Clicked(View v) {
        Toast.makeText(this, "Button Clicked : " + ((Button) v).getText(), Toast.LENGTH_LONG).show();

    }
}
