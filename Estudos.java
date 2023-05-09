package com.estudos;

import java.util.Scanner;

public class Estudos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Circle
        Circle circle = new Circle("Red", 6.0d);

        //Rectangle
        Rectangle rectangle = new Rectangle("Blue", 10.0d, 8.0d);

        //Square
        Square square = new Square("Yellow", 9.0d, 6.0d);

        //Triangle
        Triangle triangle = new Triangle("Grey", 7.0d, 5.0d);

        //Fill Figures
        Figure[] figure = new Figure[4];
        String figurePosition;
        boolean figureValid = false;

        for (int i = 0; i < figure.length; i++) {
            System.out.println("Digite a figura a ser impressa na posição: " + (i + 1));
            figurePosition = scanner.next();

            while (!figureValid) {
                if (figurePosition.equalsIgnoreCase("Circle")) {
                    figure[i] = circle;
                    figureValid = true;
                } else if (figurePosition.equalsIgnoreCase("Square")) {
                    figure[i] = square;
                    figureValid = true;
                } else if (figurePosition.equalsIgnoreCase("Rectangle")) {
                    figure[i] = rectangle;
                    figureValid = true;
                } else if (figurePosition.equalsIgnoreCase("Triangle")) {
                    figure[i] = triangle;
                    figureValid = true;
                } else {
                    System.out.println("Digite nome válido: ");
                    figurePosition = scanner.next();
                }
            }
            
            figureValid = false;
            System.out.println();
        }

        //Print Figures
        //NullPointerException
        System.out.println("Figures: ");
        System.out.println("------- --------");
        for (Figure figures : figure) {
            if (figure != null) {
                System.out.println(figures.toString());
                System.out.println("------- -------- ");
            } else {
                System.out.println("Null Pointer Exception");
            }
        }

    }
}
