package phelat.TextView.Sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import phelat.TextView.Plus;

/**
 *
 * Sample for TextViewPlus Library
 * https://github.com/phelat/TextViewPlus
 *
 * */

public class MainActivity extends AppCompatActivity {

    @Override public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Plus myTextView = (Plus) findViewById(R.id.myTextView);
        myTextView.setFont("Roboto-LightItalic.ttf");

    }

}
