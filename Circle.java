package com.estudos;

public class Circle extends Figure {

    private double ray;

    //Circle Constructor
    public Circle(String color, double ray) {
        super(color);
        this.ray = ray;
    }

    //Area of Circle
    @Override
    public double area() {
        //Calcula área do circulo
        return ray * 3.14 * 2;
    }

    //Get Diameter
    public double getDiameter() {
        //Calcula Diametro do circulo
        return ray / 2;
    }

    //toString
    @Override
    public String toString() {
        String s = "";

        s += "- Circle -" + "\n"+
                "Color: " +this.getColor()
                + "Ray:" + this.ray + "\n"
                + "Diameter: " + this.getDiameter() + "\n"
                + "Area of Circle: " + this.area();

        return s;

    }

    //Getters e Setters
    public double getRay() {
        return ray;
    }

    public void setRay(double ray) {
        this.ray = ray;
    }

}
