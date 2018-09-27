package com.example.brizz.dycodetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.iv_image_detail)
    ImageView ivImageDetail;
    @BindView(R.id.tv_name_detail)
    TextView tvNameDetail;
    @BindView(R.id.tv_desc_detail)
    TextView tvDescDetail;
    @BindView(R.id.tv_dob_detail)
    TextView tvDobDetail;

    private String getNameActors, getDescActors, getDobActors, getImageActors;
    private static final String KEY_NAME  = "name_actor";
    private static final String KEY_DESC  = "desc_actor";
    private static final String KEY_DOB   = "dob_actor";
    private static final String KEY_IMAGE = "image_actor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        getNameActors  = getIntent().getStringExtra(KEY_NAME);
        getDescActors  = getIntent().getStringExtra(KEY_DESC);
        getDobActors   = getIntent().getStringExtra(KEY_DOB);
        getImageActors = getIntent().getStringExtra(KEY_IMAGE);

        getDetail(getNameActors,getDescActors,getDobActors,getImageActors);
    }

    private void getDetail(String name_detail, String desc_detail, String dob_detail, String image_detail){
        tvNameDetail.setText(name_detail);
        tvDescDetail.setText(desc_detail);
        tvDobDetail.setText(dob_detail);
        Picasso.get().load(image_detail).into(ivImageDetail);
    }
}
