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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ajlyfe.thegiffingtree.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class OptionCardAdapter extends RecyclerView.Adapter<OptionCardAdapter.ViewHolder> {

    private ArrayList<OptionCard> optionList;
    private Activity parentActivity;

    public OptionCardAdapter(@NonNull ArrayList<OptionCard> optionList, Activity parentActivity) {
        this.optionList = optionList;
        this.parentActivity = parentActivity;
    }

    @Override
    public OptionCardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.option_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final OptionCardAdapter.ViewHolder viewHolder, int position) {
        final OptionCard option = optionList.get(viewHolder.getAdapterPosition());

        TextView title = viewHolder.optionTitle;
        title.setText(option.getOptionName());
    }

    public void removeAt(int position) {
        optionList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, optionList.size());
    }

    @Override
    public int getItemCount() { return optionList.size(); }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.optionCardTitle) TextView optionTitle;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}