package com.example.cbluser22.apptest.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cbluser22.apptest.R;
import com.example.cbluser22.apptest.models.Model1;

import java.util.List;

/**
 * Created by cbluser22 on 9/2/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecycleViewHolder> {

    Activity activity;
    List<Object> mList1;

   public RecyclerAdapter(List<Object> mList, Activity activity)
   {

        this.activity=activity;
       this.mList1=mList;
   }


    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecycleViewHolder holder = null;
        holder=new RecycleViewHolder(LayoutInflater.from(activity).inflate(R.layout.row_item,parent,false));
        return holder;

    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {
       switch (getItemViewType(position))
       {
           case 0:
               String calls=mList1.get(position).toString();
               holder.textView.setText(calls);
               break;
           case 8:
               String chats=mList1.get(position).toString();
               holder.textView.setText(chats);
               break;
           case 17:
               String contacts=mList1.get(position).toString();
               holder.textView.setText(contacts);
               break;
           case 1:
               Model1 model1=(Model1) mList1.get(position);
               holder.imageView.setImageResource(model1.image);
               holder.textView.setText(model1.text);
               break;
       }


    }

    @Override
    public int getItemViewType(int position) {
        switch (position)
        {
            case 0:return 0;
            case 8:return 8;
            case 17:return 17;
            default:return 1;
        }

    }

    @Override
    public int getItemCount() {
       return mList1.size();
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public RecycleViewHolder(View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.tv);
            imageView=(ImageView)itemView.findViewById(R.id.iv_imageitem);
        }
    }
}
