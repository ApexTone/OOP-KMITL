/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

/**
 *
 * @author Predator
 */
public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>, Cloneable {

    public ComparableRectangle() {
    }

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    public ComparableRectangle(double width, double height, String color) {
        super(width, height, color);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        } else {
            return -1;
        }
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{ //'clone' all data, reference to difference memory
        return super.clone();
    }
}
