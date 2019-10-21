package com.developerswork.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Splash nextScreen = new Splash(this);
        nextScreen.start();
    }

    private class Splash extends Thread{
        private Intent main;
        public Splash(MainActivity scope){
            main = new Intent(scope,CalculatorScreen.class);
        }

        public void run(){
            try{
                this.sleep(3000);
                startActivity(this.main);
            }catch (Exception e){}
        }
    }
}
