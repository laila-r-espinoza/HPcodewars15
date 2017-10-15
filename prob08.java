
import static java.lang.System.in;
import java.util.ArrayList;
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
public class prob08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner asdf = new Scanner(in);
     int z =  asdf.nextInt();
     int emp = 0;
     int d = 0;
     int u = 0;
     ArrayList <Integer> num = new ArrayList();
     ArrayList <Integer> dup = new ArrayList();
        for (int i = 0; i < z; i++) {
            String s = asdf.next();
            int n = asdf.nextInt();
            if (num.contains(n)&&!dup.contains(n)) {
                d++;
                dup.add(n);
            }
            else num.add(n);
            if (s.contentEquals("NA")) {
                emp++;
            }
            if (n==0) {
                u++;
            }
        }
        System.out.println("Empty Cubes: "+emp);
        System.out.println("Duplicate Cube Assignments: "+d);
        System.out.println("Employees without Cube: "+u);
    }
    
}
