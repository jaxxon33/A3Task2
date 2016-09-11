/**
 * Created by paul on 11/09/2016.
 */
public class Test {
    public static void main(String[] args) {

        // creates an Octagon object with side values 5
        Octagon octagon = new Octagon(5.0);

        // and display its area and perimeter
        System.out.println("The area of the octagon is: " + octagon.getArea());
        System.out.println("The perimeter of the octagon is: " + octagon.getPerimeter());

        try {
            // Create a new object using clone method
            Octagon clonedOctagon = (Octagon) octagon.clone();

            // and compare the two objects using compareTo method
            System.out.println("The difference between the original and cloned Octagon is : " + octagon.compareTo(clonedOctagon));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
