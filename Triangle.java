package com.estudos;

public class Triangle extends Figure {

    private double base;
    private double heigth;

    //Constructor Of Triangle
    public Triangle(String color, double base, double heigth) {
        super(color);
        this.base = base;
        this.heigth = heigth;
    }

    //Area of Triangle
    @Override
    public double area() {
        //Calcula área do circulo
        return base * heigth;
    }

    //toString Triangle
    @Override
    public String toString() {

        String s = "";

        s += "  - Triangle -" + "\n"+
                "Color: " +this.getColor()
                + "Base:" + this.base + "\n"
                + "Heigth: " + this.heigth + "\n"
                + "Area of Triangle: " + this.area() + "\n";

        return s;
    }

    //Getters e Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

}
