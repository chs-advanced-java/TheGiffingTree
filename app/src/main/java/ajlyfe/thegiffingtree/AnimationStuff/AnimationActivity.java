package ajlyfe.thegiffingtree.AnimationStuff;

import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;

import ajlyfe.thegiffingtree.MainActivity;

/**
 * Created by adv_java on 11/4/16.
 */

public class AnimationActivity extends MainActivity{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        InputStream stream = null;
        try {
            stream = getAssets().open("piggy.gif");
        } catch (IOException e) {
            e.printStackTrace();
        }
        GifWebView view = new GifWebView(this, "file:///android_asset    /piggy.gif");

        setContentView(view);
    }
}
