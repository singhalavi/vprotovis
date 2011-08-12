package com.bibounde.vprotovis.common;

import java.io.Serializable;

public class Point implements Serializable {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }
}