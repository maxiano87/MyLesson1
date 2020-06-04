package com.example.lesson24_a_videofirebase;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.MyHolder> {
    Context context;
    ArrayList<Upload> arrayList;

    public VideoAdapter(Context context, ArrayList<Upload> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.video_layout,
                parent,
                false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, int position) {
        Upload upload = arrayList.get(position);
        if (upload.getUrl() != null) {
            holder.videoView.setVideoURI(Uri.parse(upload.getUrl()));
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
        VideoView videoView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            videoView = itemView.findViewById(R.id.download_video_view);
        }
    }
}
