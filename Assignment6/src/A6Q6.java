
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);

        // get size of classroom
        System.out.println("What is the size of the classroom? ");
        int size = input.nextInt();

        // get user to input the marks
        System.out.println("Please input " + size + " marks: ");
        // array to hold the inputted marks
        double[] number = new double[size];

        // filler value
        double swap = 0;

        // store the sizes inputted
        for (int i = 0; i < size; i++) {
            number[i] = input.nextDouble();
        }

        // every mark in the array is given its own turn with the first loop
        for (int i = 0; i < size; i++) {
            // the anumber of loops decrease as the mark being replaced increases on the array, this prevents the loop from going over the amount needed
            for (int x = 1; x < size - i; x++) {
                // only moves on if the previous number is larger than the current one
                if (number[x] < number[x - 1]) {
                    // update the integer swap with the current number in the array
                    swap = number[x];
                    // swaps both of the numbers in the array, putting the smaller number first
                    number[x] = number[x - 1];
                    number[x - 1] = swap;
                }

            }

        }

        // create double to represent average
        double average = 0;
        // add up all of the numbers in the array
        for (int i = 0; i < size; i++) {
            average = average + number[i];
        }
        // divide by the amount of numbers in the array for the average
        average = average / size;

        // ordered from lowest to highest, position 0 is the lowest and the highest mark being the highest position on the array minus 1
        System.out.println("Lowest mark: " + number[0]);
        System.out.println("Highest mark: " + number[size - 1]);

        // output average previously calculated
        System.out.println("Average: " + average);


    }
}
}
}
