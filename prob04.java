
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
public class prob04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner asdf = new Scanner(in);
    int x = asdf.nextInt();
    int y = asdf.nextInt();
    while(x!=0&&y!=0){
        System.out.println(x*y);
        x= asdf.nextInt();
        y = asdf.nextInt();
    }
    }
    
}
