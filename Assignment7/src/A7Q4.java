
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A7Q4 {

    public static double compoundInterest(double initialPr, double intRate, int years) {
        
        // the interest rate +1 to the power of the amount of years is calculated and multiplied by the initial principal to get the compound interest
        double compound = initialPr * Math.pow((1 + intRate), years);
        
        // return compound interest
        return compound;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);
        
        // user asked for principal amount and it is stored in the method
        System.out.println("Please enter the Principle amount: ");
        double pA = input.nextDouble();
        
        // user asked for interest rate and it is stored in the method
        System.out.println("Please enter the Interest rate: ");
        double iR = input.nextDouble();
        
        // user asked for the number of years and it is stored in the method
        System.out.println("Please enter the number of years: ");;
        int year = input.nextInt();
        
        // the function method is then used with the principle amount, interest rate, and years compounded yearly
        double filler = compoundInterest(pA, iR, year);
        
        // it's then printed
        System.out.println(filler);
        
    }
}
