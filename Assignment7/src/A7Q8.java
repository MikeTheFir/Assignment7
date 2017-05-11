/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A7Q8 {
    
    public static void season(int month, int day) {
        
        // January and February are Winter throughout those months
        if (month < 3 && month > 0) {
            System.out.println("Winter");
        }
        // During March if the day is the 16th and above then it's Spring, if below then it's still Winter
        if (month == 3) {
            if (day >= 16) {
                System.out.println("Spring");
            } else {
                System.out.println("Winter");
            }
        }
        // April and May are Spring throughout
        if (month > 3 && month < 6) {
            System.out.println("Spring");
        }
        // During June if the day is the 16th or above then it's Summer, if below then it's still Spring
        if (month == 6) {
            if (day >= 16) {
                System.out.println("Summer");
            } else {
                System.out.println("Spring");
            }
        }
        // July and August are Summer throughout
        if (month > 6 && month < 9) {
            System.out.println("Summer");
        }
        // During September, if the day is the 16th or above then it's Fall, if below then it's still Summer
        if (month == 9) {
            if (day >= 16) {
                System.out.println("Fall");
            } else {
                System.out.println("Summer");
            }
        }
        // October and November are Fall
        if (month > 9 && month < 12) {
            System.out.println("Fall");
        }
        // During December, if the day is the 16th or above then it's Winter, if below then it's still Fall
        if (month == 12) {
            if (day >= 16) {
                System.out.println("Winter");
            } else {
                System.out.println("Fall");
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        season(7, 31);
        
    }
}
