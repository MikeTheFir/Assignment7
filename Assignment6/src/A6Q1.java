
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner(System.in);

        // get how many students are in the class
        System.out.println("How many students are in the class? ");
        // use this number as the divisor for the average
        int course = input.nextInt();

        // create a list of however many students are in the class
        double[] marks = new double[course];
        // get the students marks
        System.out.println("Enter the marks: ");
        // get the number in each position
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            // add all the numbers together to divide for the average
            sum = sum + marks[i];
        }
        // calculate the class average
        double average = sum / marks.length;
        System.out.println("The class average is " + average);


    }
}
