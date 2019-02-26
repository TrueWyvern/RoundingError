/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double square = Math.sqrt(a);
        System.out.println(square);
        System.out.println(Math.pow(square, 2));
        double b = Math.pow(square, 2);
        System.out.println("Roundoff error = " + (b-a));
    }
    
}
