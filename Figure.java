
package com.estudos;


public abstract class Figure {
    private String color;

    //Constructor with Color
    public Figure(String color) {
        this.color = color;
    }
    
    //Constructor Default
    public Figure() {
        super();
    }
    
    //toString Default
    @Override
    public abstract String toString();
    
    //Area
    public abstract double area();
    
    //Getters e Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
