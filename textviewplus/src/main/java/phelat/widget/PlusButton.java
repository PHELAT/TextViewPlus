package phelat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;

import phelat.TextView.R;
import phelat.utils.Plus;

/**
 * Created by phelat on 4/5/17.
 * Project : TextViewPlus.
 */

public class PlusButton extends AppCompatButton {

    private static final String TAG = "TextViewPlus:Button";

    public PlusButton(Context context) {super(context);}

    public PlusButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont(context, attrs);
    }

    public PlusButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont(context, attrs);
    }

    private void setFont(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TextViewPlus);
        String customFont = a.getString(R.styleable.TextViewPlus_font);
        if (customFont != null) {
            setFont(customFont);
        }
        a.recycle();
    }

    /**
     * Set font on widget so EZ :))
     * @param asset font name in assets directory
     * @return boolean whether font is set or not
     */
    public boolean setFont(String asset) {

        Typeface typeface = null;

        try {
            typeface = Plus.get(getContext(), asset);
        } catch (Exception e) {
            Log.e(TAG, "Could not set TypeFace : " + e.getMessage());
            return false;
        }

        setTypeface(typeface);
        return true;

    }

}