
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);

        // ask for 10 marks
        System.out.println("Please write a series of 10 marks: ");
        // make an array to hold the marks
        int[] number = new int[10];

        // filler value
        int swap = 0;

        // this loop will store the 10 marks put in the number array
        for (int i = 0; i < 10; i++) {
            number[i] = input.nextInt();
        }

        // every mark in the array is given its own turn with the first loop
        for (int i = 0; i < 10; i++) {
            // the anumber of loops decrease as the mark being replaced increases on the array, this prevents the loop from going over the amount needed
            for (int x = 1; x < 10 - i; x++) {
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
        for (int i = 0; i < 10; i++) {
            System.out.print(number[i] + ", ");

        }


    }
}
