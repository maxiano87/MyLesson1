package com.example.lesson15_practic_resylcleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {

    ArrayList<Car> cars;

    // Список данных передается через конструктор - CarAdapter
    public CarAdapter(ArrayList<Car> cars) {this.cars = cars; }


    //ViewHolder сводит к минимуму количество обращений к дорогостоящему
    // в плане ресурсов методу findViewById. Нет необходимости каждый раз
    // использовать findViewById и указать ID;
    // Не нужно каждый раз тратить процессорное время на поиск конкретного ID в xml;
    // удобно обращаться в любом месте к элементу через созданное поле.
    public class CarViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView desc;
        public CarViewHolder (View view) {
            super(view);
            image = (ImageView) view.findViewById(R.id.car);
            desc = (TextView) view.findViewById(R.id.desc);
        }

    }

    // onCreateViewHolder метод вызывается, когда CarViewHolder должен быть инициалирован.
    // Мы указывать макет для каждого элемента RecylerView
    // Затем LayoutInflater заполняет макет, и передает его в конструктор CarViewHolder
    // onCreateViewHolder() сохздает новый объект СarViewHolder всякий раз,
    // когда RycylclerView нуждается в этом
    // Это тот момент, когда создается layout строки списка, передается объекту CarViewHolder,
    // и каждый дочерний view-компонент может быть найден и сохранен.


    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,
                false);
        return new CarViewHolder(view);
    }

    // onBindViewHolder() принимает объект ViewHolder и усстанавливает необходимые данные
    // для соответствующей строки во view - компоненте

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        holder.desc.setText(cars.get(position).getDescription());
        holder.image.setImageResource(cars.get(position).getImage());
    }

    // getItemCount () вернет количество элементов, присутвующих в данных
    @Override
    public int getItemCount() {
        return cars.size();
    }
}
