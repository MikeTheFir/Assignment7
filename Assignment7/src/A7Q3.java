/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A7Q3 {

    public static void factors(int parameter) {

        for (int i = 1; i <= parameter; i++) {
            // numbers from 1 - parameter is checked for a remainder when divided from the parameter
            // if there's no remainders then it's a factor and is printed
            if (parameter % i == 0) {
                System.out.print(i + " ");
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        factors(30);
        
    }
}
