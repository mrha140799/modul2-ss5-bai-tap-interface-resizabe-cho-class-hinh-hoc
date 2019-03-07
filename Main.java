package Resizable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CircleResizable crable = new CircleResizable();
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(10);
        circles[1] = new Circle(5);
        circles[2] = new Circle(12);
        System.out.println("Before resize : ");
        for (Circle c : circles) {
            System.out.println(c);
        }
        System.out.println("After resize : ");
        for (Circle c : circles){
            crable.resize(c);
            System.out.println(c);
        }
    }
}
