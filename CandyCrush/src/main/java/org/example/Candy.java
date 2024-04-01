package org.example;

public class Candy {

    private String name;
    private String color;
    private String decoration;

    public Candy(){

    }
    public Candy(String name, String color, String decoration) {
        this.name = name;
        this.color = color;
        this.decoration = decoration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
