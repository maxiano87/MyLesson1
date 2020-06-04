    package com.example.lesson25_video_image_text;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AllAdapter extends RecyclerView.Adapter<AllAdapter.MyHolder> {
     private Context context;
     private ArrayList<Upload> arrayList;

    public AllAdapter(Context context, ArrayList<Upload> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.all_item, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, int position) {
        Upload upload = arrayList.get(position);
        if (upload.getImageUrl() != null) {
            Picasso.with(context)
                    .load(upload.getImageUrl())
                    .placeholder(R.mipmap.ic_launcher)
                    .fit()
                    .centerCrop()
                    .into(holder.imageView);
        }



        if (upload.getVideoUrl() != null) {
            holder.videoView.setVideoURI(Uri.parse(upload.getVideoUrl()));
            holder.videoView.resume();
        }

        holder.videoView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                holder.videoView.start();
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public VideoView videoView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.download_image_view);
            videoView = itemView.findViewById(R.id.download_video_view);
        }
    }
}

/*    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.all_item,
                parent,false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyHolder holder, int position) {
        Upload upload = arrayList.get(position);
        if (upload.getImageUrl() != null) {
            Picasso.with(context)
                    .load(upload.getImageUrl())
                    .placeholder(R.mipmap.ic_launcher)
                    .fit()
                    .centerCrop()
                    .into(holder.imageView);
        }
        *//*@Override
        public void onBindViewHolder(@NonNull final MyHolder holder, int position) {*//*
        //    Upload upload = arrayList.get(position);
            if (upload.getVideoUrl() != null) {
                holder.videoView.setVideoURI(Uri.parse(upload.getVideoUrl()));
                holder.videoView.resume();
            }

            holder.videoView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    holder.videoView.start();
                    return false;
                }
            });
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        VideoView videoView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.download_image_view);
            videoView = itemView.findViewById((R.id.download_video_view));
        }
    }
}*/
