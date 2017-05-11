
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A7Q2 {

    public static void examGrade(int mark) {
// < 50 -> F
        // if the percent is less than 50 it is an F
        if (mark < 50) {
            System.out.println("F");
        }
// 50-59 -> D
        // if the percent is betweeen 50-59 it is a D
        if (mark >= 50 && mark <= 59) {
            System.out.println("D");
        }
// 60-69 -> C
        // if the percent is between 60-69 it is a C
        if (mark >= 60 && mark <= 69) {
            System.out.println("C");
        }
// 70 - 79 -> B
        // if the percent is between 70-79 it is a B
        if (mark >= 70 && mark <= 79) {
            System.out.println("B");
        }
// 80+ -> A
        // if the percent is greater than 80 it is an A
        if (mark >= 80) {
            System.out.println("A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        examGrade(70);
        
    }
}
