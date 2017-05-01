
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);

        int[] number = new int[2];
        // get 2 intergers from the user to put into ascending order
        System.out.println("Enter two integers: ");
        number[0] = input.nextInt();
        number[1] = input.nextInt();

        // find out which number is bigger and display the correct order of integers on the screen
        if (number[0] < number[1]) {
            System.out.println("The integers in ascending order are: " + number[0] + ", " + number[1]);
        } else {
            System.out.println("The integers in ascending order are: " + number[1] + ", " + number[0]);
        }


    }
}
