package phelat.TextView.Sample;

import android.app.Application;

import phelat.utils.Plus;

/**
 * Created by phelat on 4/5/17.
 * Project : TextViewPlus.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
    }

    @Override
    public void onTerminate(){
        super.onTerminate();

        Plus.unleash();

    }

}
