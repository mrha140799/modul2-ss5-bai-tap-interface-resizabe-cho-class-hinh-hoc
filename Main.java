package Resizable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CircleResizable crable = new CircleResizable();
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(10);
        circles[1] = new Circle(5);
        circles[2] = new Circle(12);
        for (Circle c : circles){
            System.out.println("Mời nhập vào phần trăm muốn thay đổi circle có radius= "+ c.getRadius() +" : ");
            float persen = new Scanner(System.in).nextFloat();
            crable.resize(c , persen);
            System.out.println(c);
        }
    }
}
