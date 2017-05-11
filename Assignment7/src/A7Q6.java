/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A7Q6 {

    public static int lastDigit(int numb) {

        // find the remainder
        numb = numb % 10;
        return numb;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // used with a negative integer
        int o = lastDigit(-865);

        // if the final digit is negative it's multiplied by -1
        if (o < 0) {
            o = o * -1;
        }
        // the answer is outputted to the user
        System.out.println(o);
    }
}
