
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);

        // determine how many people are giving their heights
        System.out.println("How many people will be giving their heights, including yourself? ");
        int number = input.nextInt();

        double[] tall = new double[number];
        // obtain all the heights from participants
        System.out.println("Please input all heights in centimetres: ");
        // get each of the heights
        for (int i = 0; i < tall.length; i++) {
            tall[i] = input.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < tall.length; i++) {
            // add all the heights together into a sum to be able to divide to find the average
            sum = sum + tall[i];
        }

        // calculate the average height
        double avg = sum / number;
        System.out.println("The average height is " + avg + " cm");

        // find all heights above the avg and print them out
        System.out.println("these heights are above average; ");
        for (int i = 0; i < number; i++) {
            if (tall[i] > avg) {
                System.out.println(tall[i] + "cm");
            }
        }


    }
}
