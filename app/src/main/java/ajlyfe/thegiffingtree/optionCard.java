package ajlyfe.thegiffingtree;

import android.content.Context;

import java.util.ArrayList;

import ajlyfe.thegiffingtree.R;

public class OptionCard {
    private String optionName;

    public OptionCard(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionName() {
        return this.optionName;
    }

    public OptionCard setOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }
}