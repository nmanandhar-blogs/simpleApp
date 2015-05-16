package com.mycompany;

/**
 * Created by nirmal on 5/16/2015.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public void displace(int delX, int delY) {
        this.x += delX;
        this.y += delY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Point [ ").append(x).append(" , ").append(y).append(" ]");
        return sb.toString();
    }
}
