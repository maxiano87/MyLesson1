package com.example.lesson15_e_recyclerview_prokruchivaemyi;

public class Phone {
    private String name;
    private String company;
    private int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Phone(String name, String company, int image) {
        this.name = name;
        this.company = company;
        this.image = image;
    }
}
