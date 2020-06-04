package com.example.lesson17_a_practic_todolist;

public class Note {
    private String title;
    private String description;
    private String number;
    private int priority;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getNumber() {
        return number;
    }

    public int getPriority() {
        return priority;
    }

    public Note(String title, String description, String number, int priority) {
        this.title = title;
        this.description = description;
        this.number = number;
        this.priority = priority;
    }

    public Note() {
    }
}