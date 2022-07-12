package com.dorottyat.recipe;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private int serving;
    private int time;
    private ArrayList<String> ingredients;
    private ArrayList<String> directions;
    private String note;

    public Recipe(String name, int serving, int time, ArrayList<String> ingredients, ArrayList<String> directions, String note) {
        this.name = name;
        this.serving = serving;
        this.time = time;
        this.ingredients = ingredients;
        this.directions = directions;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getDirections() {
        return directions;
    }

    public void setDirections(ArrayList<String> directions) {
        this.directions = directions;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
