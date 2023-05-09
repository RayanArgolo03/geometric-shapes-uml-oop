package com.estudos;

public class Rectangle extends Figure {

    private double sideOne;
    private double sideTwo;

    //Constructor Rectangle Inrehit
    public Rectangle(String color, double sideOne, double sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    //Constructor Default
    public Rectangle() {
    }
    
    
    //Area of Rectangle
    @Override
    public double area() {
        //Calcula área do circulo
        return (sideOne * sideTwo) / 2;
    }

    //toString Rectangle
    @Override
    public String toString() {
        String s = "";

        s += "- Rectangle -" + "\n"
                + "Color: " + this.getColor()
                + "Side One:" + this.sideOne + "\n"
                + "Side Two: " + this.sideTwo + "\n"
                + "Area of Rectangle: " + this.area();

        return s;
    }

    //Getters e Setters
    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

}
