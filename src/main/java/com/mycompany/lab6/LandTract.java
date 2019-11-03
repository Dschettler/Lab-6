package com.mycompany.lab6;

public class LandTract {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public LandTract(double length, double width) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        double area = this.width * this.length;
        return area;
    }

    @Override
    public String toString() {
        return "The Length of This Land is: " + String.format("%,.2f", this.length) + " Feet"
                + "\n" + "The Width of This Land is: " + String.format("%,.2f", this.width) + " feet";
    }

    public boolean equals(LandTract differentLand) {
        boolean isEqual;
        if (this.length == differentLand.getLength()
                && this.width == differentLand.getWidth()) {
            isEqual = true;
        } else {
            isEqual = false;
        }
        return isEqual;
    }

}
