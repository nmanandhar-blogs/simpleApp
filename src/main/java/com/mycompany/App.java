package com.mycompany;

public class App {
    public static void main(String[] args) {
        Point pointA = new Point(5, 5);
        pointA.moveTo(10, 20);
        pointA.displace(20, 0);
        System.out.println("The length of " + pointA + " is " + pointA.getLength());
    }
}
