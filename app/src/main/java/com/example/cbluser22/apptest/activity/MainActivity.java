package com.example.cbluser22.apptest.activity;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.cbluser22.apptest.R;
import com.example.cbluser22.apptest.adapters.RecyclerAdapter;
import com.example.cbluser22.apptest.models.Model1;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout=(TabLayout)findViewById(R.id.tl_main);



        tabLayout.addTab(tabLayout.newTab().setText("Calls"));
        tabLayout.addTab(tabLayout.newTab().setText("Chats"));
        tabLayout.addTab(tabLayout.newTab().setText("Contacts"));


        List<Object> mlist=new ArrayList<>();
        mlist.add("Calls");//0
        mlist.add(new Model1("Call Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Call Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Call Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Call Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Call Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Call Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Call Tab",R.mipmap.ic_launcher));


        mlist.add("Chats");//8
        mlist.add(new Model1("Chats Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Chats Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Chats Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Chats Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Chats Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Chats Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Chats Tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Chats Tab",R.mipmap.ic_launcher));

        mlist.add("Contacts");//17
        mlist.add(new Model1("Contacts tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Contacts tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Contacts tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Contacts tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Contacts tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Contacts tab",R.mipmap.ic_launcher));
        mlist.add(new Model1("Contacts tab",R.mipmap.ic_launcher));


       RecyclerAdapter adapter1=new RecyclerAdapter(mlist,MainActivity.this);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.rv_main);

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter1);


        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }
        });
        TabLayout.Tab tab=tabLayout.getTabAt(3);
        tab.select();







    }
}
