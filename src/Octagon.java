/**
 * Created by paul on 11/09/2016.
 */

import java.lang.Math;

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        // area can be computed using
        // Area = (2 + 4/(sqrt(2)) ) * side * side
        return (2 + (4 / java.lang.Math.sqrt(2))) * side * side;
    }

    @Override
    public double getPerimeter() {

        return 8 * side;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return (Octagon)super.clone();
    }

    public int compareTo(Octagon octagon){
        return (toString()).compareTo(octagon.toString());
    }
}
