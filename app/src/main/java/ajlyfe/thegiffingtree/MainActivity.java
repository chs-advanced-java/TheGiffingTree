package ajlyfe.thegiffingtree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final String PERSONAL = "Personal";

        private static final String WE_ARE_FRIENDS = "We are Friends";
            private static final String THEY_HAVE_EMBARRASSED_ME_BEFORE = "They have Embarrassed Me Before";
            private static final String BESTIES_4_LYFE = "Besties 4 Lyfe";
                private static final String GIRL = "Girl";
                    private static final String IM_WILLING_TO_BREAK_THE_GIRL_CODE = "I'm Willing to Break the Girl Code";
                    private static final String SOMEWHAT_INSULTING_GIF = "Somewhat Insulting gif";
                private static final String BOY = "Boy";
                    private static final String IM_WILLING_TO_BREAK_THE_BRO_CODE = "I'm Willing to Break the Bro Code";

        private static final String I_HATE_THEM = "I Hate Them";
            private static final String WE_USED_TO_BE_FRIENDLY = "We Used to be Friendly";
            private static final String $$$$_THEM = "$*%# Them!";

    private static final String PROFESSIONAL = "Professional";

        private static final String BETTER_THAN_THEM = "Better than Them. (Subordinate)";
            private static final String CONGRATULATE = "Congratulate";

            private static final String REPRIMAND = "Reprimand";

        private static final String THEY_ARE_BETTER_THAN_ME = "They are Better than Me. (Boss)";
            private static final String THEY_ARE_A_FIGUREHEAD = "They are a Figurehead.";
            private static final String THEY_ARE_PRETENTIOUS = "They are Pretentious";

    private RecyclerView recyclerViewOptions;
    private ArrayList<OptionCard> optionCards = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        recyclerViewOptions = (RecyclerView) findViewById(R.id.recyclerViewOptions);
        final OptionCardAdapter adapter = new OptionCardAdapter(getFirstOptions(), this);
        recyclerViewOptions.setAdapter(adapter);
        recyclerViewOptions.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<OptionCard> getFirstOptions() {
        ArrayList<OptionCard> firstOptionArray = new ArrayList<>();

        firstOptionArray.add(0, new OptionCard(
                PERSONAL,
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        newOptions(PERSONAL);
                    }
                }));

        firstOptionArray.add(1, new OptionCard(
                PROFESSIONAL,
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        newOptions(PROFESSIONAL);
                    }
                }));

        return firstOptionArray;
    }

    private void newOptions(String oldOption) {
        // Clear everything for the RecyclerView
        optionCards.clear();

        // Recreate optionCards ArrayList
        switch (oldOption) {
            case PERSONAL:
                break;

            case PROFESSIONAL:
                break;
        }
    }
}
