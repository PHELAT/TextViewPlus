package phelat.utils;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

public class PlusTypefaceSpan extends TypefaceSpan {

    private Typeface typeface;

    public PlusTypefaceSpan(Typeface typeface) {
        super("");
        this.typeface = typeface;
    }

    @Override
    public void updateDrawState(TextPaint ds) {applyTypeFace(ds, typeface);}

    @Override
    public void updateMeasureState(TextPaint paint) {applyTypeFace(paint, typeface);}

    private static void applyTypeFace(Paint paint, Typeface tf) {paint.setTypeface(tf);}

}
