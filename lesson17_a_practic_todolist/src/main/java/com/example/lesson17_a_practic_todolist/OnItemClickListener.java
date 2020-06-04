package com.example.lesson17_a_practic_todolist;

import com.google.firebase.firestore.DocumentSnapshot;

public interface OnItemClickListener {
    void onItemClick (DocumentSnapshot documentSnapshot, int position);
}
