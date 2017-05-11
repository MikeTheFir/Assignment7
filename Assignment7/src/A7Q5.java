/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A7Q5 {
    
    public static void chaotic(int parameter) {
        
        // limits the number of lines of astrix's that will be printed
        for (int i = 0; i < parameter; i++) {
            // the randomizers output is limited from 1 to 5
            int randNumb = (int) (Math.random() * (5)) + 1;

            // this loop prints the astrix's out while limiting the amount to output from the randomizer
            for (int x = 0; x < randNumb; x++) {
                System.out.print("*");
            }
            // creates a new line for the next line of astrix's
            System.out.println();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        chaotic(6);
        
        
        
    }
}
