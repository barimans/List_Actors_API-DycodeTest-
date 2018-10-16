package com.example.brizz.dycodetest.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.brizz.dycodetest.DetailActivity;
import com.example.brizz.dycodetest.R;
import com.example.brizz.dycodetest.model.ActorsItem;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.ViewHolder> {

    private Context context;
    private List<ActorsItem> actorsItemList;

    public ActorAdapter(Context context, List<ActorsItem> actorsItemList) {
        this.context = context;
        this.actorsItemList = actorsItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.actors_item_layout, viewGroup, false);
        context = viewGroup.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int position) {

        final String name_data = actorsItemList.get(position).getName();
        final String desc_data = actorsItemList.get(position).getDescription();
        final String dob_data  = actorsItemList.get(position).getDob();
        final String uri_image = actorsItemList.get(position).getImage();

        //getAllDataActors
        viewHolder.getActorsData(name_data,desc_data,dob_data,uri_image);

        //sendDetailActors
        viewHolder.cvList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDetail(name_data,desc_data,dob_data,uri_image);
            }
        });

    }

    @Override
    public int getItemCount() {
        return actorsItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.cv_list)
        CardView cvList;
        @BindView(R.id.iv_image_list)
        ImageView ivImageList;
        @BindView(R.id.tv_name_list)
        TextView tvNameList;
        @BindView(R.id.tv_desc_list)
        TextView tvDescList;
        @BindView(R.id.tv_dob_list)
        TextView tvDobList;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void getActorsData(String name_list, String desc_list, String dob_list, String image_list){
            tvNameList.setText(name_list);
            tvDescList.setText(desc_list);
            tvDobList.setText(dob_list);

            Picasso.get().load(image_list).into(ivImageList);

        }
    }

    public void sendDetail(String name, String desc, String dob, String image){
        Intent sendData = new Intent(context, DetailActivity.class);
        sendData.putExtra("name_actor",name);
        sendData.putExtra("desc_actor",desc);
        sendData.putExtra("dob_actor",dob);
        sendData.putExtra("image_actor",image);
        context.startActivity(sendData);
    }
}
