package com.avinash.loginclairvoyant;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by avinash on 27/5/16.
 */
public class FriendsRecycleAdapter  extends RecyclerView.Adapter<FriendsRecycleAdapter.FriendsViewAdapter>{


    @Override
    public FriendsViewAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.friends_card, parent, false);
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onBindViewHolder(FriendsViewAdapter holder, int position) {

    }

    class FriendsViewAdapter extends RecyclerView.ViewHolder{

        public FriendsViewAdapter(View itemView) {
            super(itemView);
        }


    }
}
