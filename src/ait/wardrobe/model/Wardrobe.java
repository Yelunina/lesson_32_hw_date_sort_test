package ait.wardrobe.model;

import java.util.Objects;

public class Wardrobe implements Comparable<Wardrobe> {
    double height;
    double width;
    double depth;

    public Wardrobe(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }
    public double area(){
        return width*depth;
    }
    public  double volume(){
        return  area()*height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wardrobe wardrobe)) return false;
        return Double.compare(wardrobe.getHeight(), getHeight()) == 0 && Double.compare(wardrobe.getWidth(), getWidth()) == 0 && Double.compare(wardrobe.getDepth(), getDepth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth(), getDepth());
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", area=" + area() +
                ", volume=" + volume() +
                '}';
    }

    @Override
    public int compareTo(Wardrobe o) {
        return Double.compare(height,o.height);
    }
}
