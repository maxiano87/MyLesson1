package com.example.lesson14_a_customadapter;

public class State {
    private String name;
    private String capital;
    private int flagResurce;

    public State (String name, String capital, int flag) {
        this.name = name;
        this.capital = capital;
        this.flagResurce = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getFlagResurce() {
        return flagResurce;
    }

    public void setFlagResurce(int flagResurce) {
        this.flagResurce = flagResurce;
    }
}
