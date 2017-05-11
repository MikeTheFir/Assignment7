/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A7Q7 {
    
    public static int firstDigit(int numb) {
        // all integers are made positive by multiplying by -1
        if (numb < 0) {
            numb = numb * -1;
        }
        // while the number is bigger than 2 digits the loop will divide by 10 to get the first digit
        while (numb > 10) {
            numb = numb / 10;
        }
        // the first digit is returned
        return numb;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // tested with a negative number
        int first = firstDigit(-987654321);
        
        
        // printed to the user
        System.out.println(first);
        
        
        
    }
}
