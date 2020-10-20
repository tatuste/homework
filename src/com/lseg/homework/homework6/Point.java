package com.lseg.homework.homework6;

public class Point {

    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double distance;
        distance = Math.sqrt(x * x + y * y);
        return distance;
    }

    public double distance(Point another) {
        double distance;
        distance = Math.sqrt((another.x - this.x) * (another.x - this.x) + (another.y - y) * (another.y - y));
        return distance;
    }
}
