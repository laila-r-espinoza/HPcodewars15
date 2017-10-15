
import static java.lang.System.in;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laila
 */
public class prob06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner asdf = new Scanner(in);
              double a = asdf.nextInt();
              int b = asdf.nextInt();
              int c = asdf.nextInt();
              System.out.println((int)(Math.ceil(a*b*c/27)));
    }
    
}
