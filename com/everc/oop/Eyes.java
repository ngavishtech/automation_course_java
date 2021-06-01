package com.everc.oop;

public class Eyes {

    private Color color;
    private String shape;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Eyes{" +
                "color=" + color +
                ", shape='" + shape + '\'' +
                '}';
    }
}
