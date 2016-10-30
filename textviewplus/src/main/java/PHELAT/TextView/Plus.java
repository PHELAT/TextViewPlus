package PHELAT.TextView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

public class Plus extends TextView {

    private static final String TAG = "TextViewPlus";

    public Plus(Context context) {super(context);}

    public Plus(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont(context, attrs);
    }

    public Plus(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont(context, attrs);
    }

    private void setFont(Context context, AttributeSet attrs) {

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TextViewPlus);

        String customFont = a.getString(R.styleable.TextViewPlus_font);

        setFont(context, customFont);

        a.recycle();

    }

    public boolean setFont(Context context, String asset) {

        Typeface typeface = null;

        try {

            typeface = Typeface.createFromAsset(context.getAssets(), asset);

        } catch (Exception e) {

            Log.e(TAG, "Could not get typeface: " + e.getMessage());
            return false;

        }

        setTypeface(typeface);
        return true;
    }

}