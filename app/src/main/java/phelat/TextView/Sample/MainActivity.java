package phelat.TextView.Sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import phelat.widget.PlusButton;
import phelat.widget.PlusProgressDialog;
import phelat.widget.PlusTextView;

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

        PlusTextView myTextView = (PlusTextView) findViewById(R.id.myTextView);
        myTextView.setFont("Roboto-LightItalic.ttf");

        PlusButton progressButton = (PlusButton) findViewById(R.id.progressButton);
        progressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlusProgressDialog plusProgressDialog = new PlusProgressDialog(MainActivity.this);
                plusProgressDialog.setProgressMessage("Please Wait...");
                plusProgressDialog.setFont("Roboto-LightItalic.ttf");
                plusProgressDialog.setCancelable(true);
                plusProgressDialog.show();
            }
        });

    }

}
