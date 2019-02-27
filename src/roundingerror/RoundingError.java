/*
 * Aisik Pilote
 * rounding program
 * check for the rounding error that comes with math.pow function and math.sqre function
 */

package roundingerror;
import java.util.Scanner;
/**
 *
 * @author aipil3692
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //user input
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        //square number
        double square = Math.sqrt(a);
        System.out.println(square);
        //reverse operation
        System.out.println(Math.pow(square, 2));
        double b = Math.pow(square, 2);
        //check rounding error
        System.out.println("Roundoff error = " + (b-a));
    }
    
}
