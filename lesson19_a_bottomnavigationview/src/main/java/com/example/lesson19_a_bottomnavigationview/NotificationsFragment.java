package com.example.lesson19_a_bottomnavigationview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NotificationsFragment extends Fragment {

    public NotificationsFragment() {
    }

    public static NotificationsFragment newInstance() {return new NotificationsFragment(); }

    @Override
    public  View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notification, container, false);
    }
}