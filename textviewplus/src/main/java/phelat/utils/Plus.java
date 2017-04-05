package phelat.utils;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;
import java.util.Map;

public class Plus {

    private static final Map<String, Typeface> TYPEFACES = new HashMap<>();

    /**
     * Get saved typeface, if not saved create one and return it
     * @param context
     * @param fontFileName
     * @return Typeface
     */
    public static Typeface get(Context context, String fontFileName){

        Typeface typeface = TYPEFACES.get(fontFileName);

        if(typeface == null){
            typeface = Typeface.createFromAsset(context.getResources().getAssets(), fontFileName);
            TYPEFACES.put(fontFileName, typeface);
        }

        return typeface;
    }

    /**
     * Clear saved typefaces
     */
    public static void unleash(){
        if (!TYPEFACES.isEmpty()){
            TYPEFACES.clear();
        }
    }

}
