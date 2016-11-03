package ajlyfe.thegiffingtree;

import android.app.Activity;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ajlyfe.thegiffingtree.R;

// Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views from the inflated layout
public class OptionCardAdapter extends RecyclerView.Adapter<OptionCardAdapter.ViewHolder> {

    // Store objects to store data
    private List<OptionCard> optionList;

    // Store parent activity
    Activity parentActivity;

    // Pass in the predefined Array into the constructor
    public OptionCardAdapter(@NonNull List<OptionCard> options, Activity parentActivity) {
        optionList = options;
        this.parentActivity = parentActivity;
    }

    @Override
    public OptionCardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        // Inflate the custom layout
        View card = inflater.inflate(R.layout.option_card, parent, false);

        // Return a new holder instance
        return new ViewHolder(card);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(final OptionCardAdapter.ViewHolder viewHolder, int position) {

        // Get the object and it's data based on position
        final OptionCard option = optionList.get(position);

        // Define the views from ViewHolder up here to play with them and do things! yasss
        TextView title = viewHolder.optionTitle;
        title.setText(option.getOptionName());
    }

    public void removeAt(int position) {
        optionList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, optionList.size());
    }

    // Returns the total count of items in the list probably won't use this but we gotta @Override
    @Override
    public int getItemCount() { return optionList.size(); }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    class ViewHolder extends RecyclerView.ViewHolder {
        // These will be referenced every time up in the BindViewHolder
        TextView optionTitle;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);
            this.optionTitle = (TextView) itemView.findViewById(R.id.optionCardTitle);
        }
    }
}