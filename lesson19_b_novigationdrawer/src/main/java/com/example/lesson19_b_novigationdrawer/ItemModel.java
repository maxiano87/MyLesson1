package com.example.lesson19_b_novigationdrawer;

public class ItemModel {
    public int icon;
    public String name;

    // Модель данных используемая в адаптере
    // DrawerItemCustomAdapter

    public ItemModel (int icon, String name) {
        this.icon = icon;
        this.name = name;
    }
}
