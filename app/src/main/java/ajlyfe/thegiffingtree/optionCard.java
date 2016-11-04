package ajlyfe.thegiffingtree;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import java.util.ArrayList;

import ajlyfe.thegiffingtree.R;

public class OptionCard {
    private String optionName;
    private View.OnClickListener onClickListener;

    public OptionCard(String optionName, @NonNull View.OnClickListener onClickListener) {
        this.optionName = optionName;
        this.onClickListener = onClickListener;
    }

    public String getOptionName() {
        return this.optionName;
    }

    public View.OnClickListener getOnClickListener() {
        return this.getOnClickListener();
    }

    public OptionCard setOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }

    public OptionCard setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
        return this;
    }
}