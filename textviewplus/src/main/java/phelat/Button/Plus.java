package phelat.Button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;

import phelat.TextView.R;
import phelat.Utils.FontHelper;

public class Plus extends AppCompatButton {

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

        setFont(customFont);

        a.recycle();

    }

    public boolean setFont(String asset) {

        Typeface typeface = null;

        try {

            typeface = FontHelper.get(getContext(), asset);

        } catch (Exception e) {

            Log.e(TAG, "Could not set TypeFace : " + e.getMessage());
            return false;

        }

        setTypeface(typeface);
        return true;

    }

}
