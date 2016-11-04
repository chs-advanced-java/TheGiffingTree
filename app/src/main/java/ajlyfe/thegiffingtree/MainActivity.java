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
    private static final String PROFESSIONAL = "Professional";

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
