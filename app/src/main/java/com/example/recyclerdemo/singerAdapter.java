package com.example.recyclerdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class singerAdapter extends RecyclerView.Adapter<singerAdapter.MyViewHolder> {

    private List<SingerModelClass> modelClassList;              //1

    public singerAdapter(List<SingerModelClass> modelClassList) {               //2
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override   //4
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent, false);
        return new MyViewHolder(view);
    }

    @Override//6
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        int img =modelClassList.get(position).getImage();
        String name=modelClassList.get(position).getSingerName();
        String genre =modelClassList.get(position).getGenre();
        myViewHolder.setData(img,name,genre);
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();    //8
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder {         //3
        private ImageView singImg;
        private TextView singName;
        private TextView singGenre;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);        //5
            singImg = itemView.findViewById(R.id.img_id);
            singName = itemView.findViewById(R.id.name_id);
            singGenre =itemView.findViewById(R.id.genre_id);

        }

        public  void setData(int img, String name, String genre) {
            singImg.setImageResource(img);
            singName.setText(name);
            singGenre.setText(genre);   //7


        }
    }
}
