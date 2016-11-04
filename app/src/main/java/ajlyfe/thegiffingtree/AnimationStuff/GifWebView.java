package ajlyfe.thegiffingtree.AnimationStuff;

import android.content.Context;
import android.webkit.WebView;

/**
 * Created by adv_java on 11/4/16.
 */

public class GifWebView extends WebView {

    public GifWebView(Context context, String path) {
        super(context);

        loadUrl(path);
    }
}
