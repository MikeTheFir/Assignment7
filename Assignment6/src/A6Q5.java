
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);
        
        // ask how many marks they want to input
        System.out.println("How many marks would you like to input? ");
        int amount = input.nextInt();

        // ask for 10 marks
        System.out.println("Please write a series of " + amount + " marks: ");
        // make an array to hold the marks
        double[] number = new double[amount];
        
        // filler value
        double swap = 0;
 
        // this loop will store the 10 marks put in the number array
        for (int i = 0; i < amount; i++) {
            number[i] = input.nextInt();
        }

        // every mark in the array is given its own turn with the first loop
        for (int i = 0; i < amount; i++) {
            // the anumber of loops decrease as the mark being replaced increases on the array, this prevents the loop from going over the amount needed
            for (int x = 1; x < amount - i; x++) {
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
        // creates filler space
        System.out.println();
        // numbers printed from lowest to highest
        for (int i = 0; i < amount; i++) {
            System.out.print(number[i] + ", ");

        }
        // create a space
        System.out.println();
        
        // if the # of marks is odd, then minus 1 and divide by 2 to find array placement in the middle. Used to output the number in the middle of the array
        if (amount % 2 == 1) {
            amount = (amount - 1) / 2;
            System.out.println("Median: " + number[amount]);
            
             // if the amount of numbers in the array are not even
        } else {
            // create the median double which becomes the average of the 2 numbers in the middle of the array by adding them and then dividing by 2
            double median = 0;
            median = ((double) number[number.length / 2] + (double) number[number.length / 2 - 1]) / 2;
            // output to the user
            System.out.println("Median: " + median);
           
        }
    }
    }
