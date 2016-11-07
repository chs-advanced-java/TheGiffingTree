package ajlyfe.thegiffingtree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.View;

import java.io.File;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

import static android.R.attr.animation;

public class MainActivity extends AppCompatActivity {

    private static final String PERSONAL = "Personal";

        private static final String FRIENDS = "We are Friends";
            private static final String EMBARRASSED = "They have Embarrassed Me Before";
            private static final String BESTIES = "Besties 4 Lyfe";

        private static final String HATE = "I Hate Them";
            private static final String FRIENDLY = "We Used to be Friendly";
            private static final String $$$$ = "$*%# Them!";

    private static final String PROFESSIONAL = "Professional";

        private static final String BETTER_THAN_THEM = "I am Better than Them. (Subordinate)";
            private static final String CONGRATULATE = "Congratulate";
            private static final String REPRIMAND = "Reprimand";

        private static final String BETTER_THAN_ME = "They are Better than Me. (Boss)";
            private static final String FIGUREHEAD = "They are a Figurehead.";
            private static final String PRETENTIOUS = "They are Pretentious";

    private RecyclerView recyclerViewOptions;
    private ArrayList<optionCard> optionCards = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

       /** recyclerViewOptions = (RecyclerView) findViewById(R.id.recyclerViewOptions);
        final OptionCardAdapter adapter = new OptionCardAdapter(getDummyArray(), this);
=======
        recyclerViewOptions = (RecyclerView) findViewById(R.id.recyclerViewOptions);
        final OptionCardAdapter adapter = new OptionCardAdapter(getFirstOptions(), this);
        recyclerViewOptions.setAdapter(adapter);
        recyclerViewOptions.setLayoutManager(new LinearLayoutManager(this));**/

        
    }

    private ArrayList<optionCard> getFirstOptions() {
        ArrayList<optionCard> firstOptionArray = new ArrayList<>();

        firstOptionArray.add(0, new optionCard(
                PERSONAL,
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        newOptions(PERSONAL);
                    }
                }));

        firstOptionArray.add(1, new optionCard(
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
                optionCards.add(0, new optionCard(
                        null,
                        null
                ));
                break;

            case PROFESSIONAL:
                optionCards.add(1, new optionCard(
                        null,
                        null
                ));
                break;
        }
    }
}
