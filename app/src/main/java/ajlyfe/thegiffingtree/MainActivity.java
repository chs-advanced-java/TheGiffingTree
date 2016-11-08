package ajlyfe.thegiffingtree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

import static android.R.attr.animation;
import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {

    private static final String PERSONAL = "Personal";

        private static final String FRIENDS = "We are friends";
            private static final String EMBARRASSED = "They have embarrassed me before";
            private static final String BESTIES = "Besties 4 lyfe";
                private static final String GIRL = "Girl";
                    private static final String BREAK_GIRL_CODE = "I'm willing to break the girl code.";
                    private static final String SOMEWHAT_INSULTING_GIRL = "Just a somewhat insulting gif!";
                private static final String BOY = "BOY";
                    private static final String BREAK_BRO_CODE = "I'm willing to break the bro code.";
                    private static final String SOMEWHAT_INSULTING_BOY = "Just a somewhat insulting gif! ";
                    // REPEAT SOMEWHAT INSULTING

    private static final String HATE = "I hate them";
            private static final String FRIENDLY = "We used to be friendly";
            private static final String PROFANITY = "$*%# them!";

    private static final String PROFESSIONAL = "Professional";

        private static final String BETTER_THAN_THEM = "I am better than them. (Subordinate)";
            private static final String CONGRATULATE = "Congratulate";
                private static final String GENUINE = "Genuine";
                private static final String SARCASTIC = "Sarcastic";
            private static final String REPRIMAND = "Reprimand";
                private static final String PROBATION = "Super secret probation.";
                private static final String FIRED = "You're fired!";

        private static final String BETTER_THAN_ME = "They are better than me. (Boss)";
            private static final String FIGUREHEAD = "They are a figurehead.";
                private static final String CONFESS = "Confess to an office crime.";
                private static final String AGREE = "Agree to a pet project.";
            private static final String PRETENTIOUS = "They are pretentious";
                private static final String NEW_JOB = "Looking for a new job.";
                private static final String QUIT = "I quit!";

    private ArrayList<OptionCard> optionCards = new ArrayList<>();
    private OptionCardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        RecyclerView recyclerViewOptions = (RecyclerView) findViewById(R.id.recyclerViewOptions);
        adapter = new OptionCardAdapter(getFirstOptions(), this);
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
                        refreshRecycler();
                    }
                }));

        firstOptionArray.add(1, new OptionCard(
                PROFESSIONAL,
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        newOptions(PROFESSIONAL);
                        refreshRecycler();
                    }
                }));

        return firstOptionArray;
    }

    private void newOptions(final String oldOption) {
        // Clear everything for the RecyclerView
        optionCards.clear();
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newOptions(v.getTag().toString());
                refreshRecycler();
            }
        };

        // Recreate optionCards ArrayList
        switch (oldOption) {
            case PERSONAL:
                optionCards.add(0, new OptionCard(
                        FRIENDS,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        HATE,
                        onClickListener
                ));
                break;

            case PROFESSIONAL:
                optionCards.add(0, new OptionCard(
                        BETTER_THAN_THEM,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        BETTER_THAN_ME,
                        onClickListener
                ));
                break;

            /** LEVEL TWO **/

            case FRIENDS:
                optionCards.add(0, new OptionCard(
                        EMBARRASSED,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        BESTIES,
                        onClickListener
                ));
                break;

            case HATE:
                optionCards.add(0, new OptionCard(
                        FRIENDLY,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        PROFANITY,
                        onClickListener
                ));
                break;

            case BETTER_THAN_THEM:
                optionCards.add(0, new OptionCard(
                        CONGRATULATE,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        REPRIMAND,
                        onClickListener
                ));
                break;

            case BETTER_THAN_ME:
                optionCards.add(0, new OptionCard(
                        FIGUREHEAD,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        PRETENTIOUS,
                        onClickListener
                ));
                break;

            /** LEVEL THREE **/

            case EMBARRASSED:
                //TODO: GIF
                break;

            case BESTIES:
                optionCards.add(0, new OptionCard(
                        GIRL,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        BOY,
                        onClickListener
                ));
                break;

            case FRIENDLY:
                //TODO: GIF
                break;

            case PROFANITY:
                //TODO: GIF
                break;

            case CONGRATULATE:
                optionCards.add(0, new OptionCard(
                        GENUINE,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        SARCASTIC,
                        onClickListener
                ));
                break;

            case REPRIMAND:
                optionCards.add(0, new OptionCard(
                        PROBATION,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        FIRED,
                        onClickListener
                ));
                break;

            case FIGUREHEAD:
                optionCards.add(0, new OptionCard(
                        CONFESS,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        AGREE,
                        onClickListener
                ));
                break;

            case PRETENTIOUS:
                optionCards.add(0, new OptionCard(
                        NEW_JOB,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        QUIT,
                        onClickListener
                ));
                break;

            /** LEVEL FOUR **/

            case GIRL:
                optionCards.add(0, new OptionCard(
                        BREAK_GIRL_CODE,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        SOMEWHAT_INSULTING_GIRL,
                        onClickListener
                ));
                break;

            case BOY:
                optionCards.add(0, new OptionCard(
                        BREAK_BRO_CODE,
                        onClickListener
                ));

                optionCards.add(1, new OptionCard(
                        SOMEWHAT_INSULTING_BOY,
                        onClickListener
                ));
                break;

            case GENUINE:
                startActivity(new Intent(MainActivity.this, GenuineGif.class));
                break;

            case SARCASTIC:
                //TODO: GIF
                break;

            case PROBATION:
                //TODO: GIF
                break;

            case FIRED:
                //TODO: GIF
                break;

            case CONFESS:
                //TODO: GIF
                break;

            case AGREE:
                //TODO: GIF
                break;

            case NEW_JOB:
                //TODO: GIF
                break;

            case QUIT:
                //TODO: GIF
                break;

            /** LEVEL FIVE **/

            case BREAK_GIRL_CODE:
                //TODO: GIF
                break;

            case SOMEWHAT_INSULTING_BOY:
                //TODO: GIF
                break;

            case SOMEWHAT_INSULTING_GIRL:
                //TODO: GIF
                break;

            case BREAK_BRO_CODE:
                //TODO: GIF
                break;
        }
    }

    private void refreshRecycler() {
        Log.d("RecyclerView", "Refreshed views");
        adapter.setOptionList(optionCards);
        adapter.notifyDataSetChanged();
    }
}
