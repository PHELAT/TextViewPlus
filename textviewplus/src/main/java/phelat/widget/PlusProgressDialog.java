package phelat.widget;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;

import phelat.utils.Plus;
import phelat.utils.PlusTypefaceSpan;

/**
 * Created by phelat on 4/5/17.
 * Project : TextViewPlus.
 */

public class PlusProgressDialog extends ProgressDialog {

    private static final String TAG = "TextViewPlus:PrgrsDilog";

    private Typeface progressFont = Typeface.SANS_SERIF;

    private SpannableStringBuilder progressText = new SpannableStringBuilder("");

    public PlusProgressDialog(Context context) {super(context);}

    public boolean setFont(String asset) {

        try {
            progressFont = Plus.get(getContext(), asset);
        } catch (Exception e) {
            Log.e(TAG, "Could not set TypeFace : " + e.getMessage());
            return false;
        }

        setProgressMessage(progressText.toString());
        return true;
    }

    public void setProgressMessage(String text){

        progressText = new SpannableStringBuilder(text);
        progressText.setSpan(new PlusTypefaceSpan(progressFont),
                0,
                progressText.length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        super.setMessage(progressText);
    }

}
