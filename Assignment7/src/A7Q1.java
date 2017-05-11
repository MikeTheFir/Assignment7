
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A7Q1 {

    // method to find area of a circle given the radius
    public static double areaCircle(double radius) {

        // find the radius squared
        double rSquared = Math.pow(radius, 2);
        // find the area
        double area = Math.PI * rSquared;
        // send back the answer
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);

        // ask for the radius
        System.out.println("What is the radius? ");
        double radius = input.nextDouble();

        // find are of circle and tell user
        double answer = areaCircle(radius);
        System.out.println("The area is " + answer + " cm squared");

    }
}
