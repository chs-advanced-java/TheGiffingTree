package ajlyfe.thegiffingtree;

import android.content.Context;

import java.util.ArrayList;

import ajlyfe.thegiffingtree.R;

public class OptionCard {
    private String optionName;

    public OptionCard(String o) {
        optionName = o;
    }

    public String getOptionName() {
        return optionName;
    }

    public OptionCard setOptionName(String o) {
        this.optionName = o;
        return this;
    }
}