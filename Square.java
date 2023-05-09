package com.estudos;

public class Square extends Rectangle {

    //Constructor Of Square
      public Square(String color, double sideOne, double sideTwo) {
        super(color, sideOne, sideTwo);
    }

    //Area of Square
    @Override
    public double area() {
        //Calcula área do circulo
        return this.getSideOne() * this.getSideTwo();
    }

    //toString Square
    @Override
    public String toString() {

        String s = "";

        s += " - Square -" + "\n"+
                "Color: " +this.getColor()
                + "Side One:" + this.getSideOne() + "\n"
                + "Side Two: " + this.getSideTwo() + "\n"
                + "Area of Square: " + this.area() + "\n";

        return s;
    }

}
