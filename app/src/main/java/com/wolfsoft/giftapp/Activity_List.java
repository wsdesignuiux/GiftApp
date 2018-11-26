package com.wolfsoft.giftapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.GiftList_Adapter;
import model.GiftlistModel;

public class Activity_List extends AppCompatActivity {

    private GiftList_Adapter giftList_adapter;
    private RecyclerView recyclerview;
    private ArrayList<GiftlistModel> giftlistModelArrayList;

    String txt[]={"activity_ob1","activity_single_product","activity_shop_home"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift_list);

        recyclerview=findViewById(R.id.recyclerView1);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Activity_List.this);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setLayoutManager(layoutManager);
        giftlistModelArrayList = new ArrayList<>();

        for (int i=0;i<txt.length;i++){
            GiftlistModel activity_list_model = new GiftlistModel(txt[i]);

            giftlistModelArrayList.add(activity_list_model);

        }
        giftList_adapter = new GiftList_Adapter(Activity_List.this,giftlistModelArrayList);
        recyclerview.setAdapter(giftList_adapter);

    }
}
