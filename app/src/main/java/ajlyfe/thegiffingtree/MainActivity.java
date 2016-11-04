package ajlyfe.thegiffingtree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.io.File;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

import static android.R.attr.animation;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

       /** recyclerViewOptions = (RecyclerView) findViewById(R.id.recyclerViewOptions);
        final OptionCardAdapter adapter = new OptionCardAdapter(getDummyArray(), this);
        recyclerViewOptions.setAdapter(adapter);
        recyclerViewOptions.setLayoutManager(new LinearLayoutManager(this));**/

        
    }

    private ArrayList<OptionCard> getDummyArray() {
        ArrayList<OptionCard> dummyArray = new ArrayList<>();

        dummyArray.add(0, new OptionCard("Personal"));
        dummyArray.add(1, new OptionCard("Professional"));

        return dummyArray;
    }
}
