package com.example.lesson14_a_customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class StateAdapter extends ArrayAdapter <State> {
    private LayoutInflater inflater;
    private int layout;
    private List<State> states;

    public StateAdapter( Context context, int resource, List<State> states) {
        super(context, resource, states);
        this.layout = resource;
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView (int position, View convertView, ViewGroup parent) {
        //с помощью объекта Layoutinflater создаем объект
        // View для каждого отдельного элемента в списке
        View view = inflater.inflate(this.layout,parent, false);

        //Из созданного объекта View получаем
        // элементы ImageView и TextView по id

        ImageView flagView = (ImageView) view.findViewById(R.id.flag);
        TextView nameView = (TextView) view.findViewById(R.id.name);
        TextView capitalView = (TextView) view.findViewById(R.id.capital);

        // Далее используя параметр position,
        // получаем объект State, для которого создается разметка
        State state = states.get(position);

        flagView.setImageResource(state.getFlagResurce());
        nameView.setText(state.getName());
        capitalView.setText(state.getCapital());

        return  view;
    }
}
