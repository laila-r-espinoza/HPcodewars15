
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
public class prob11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner asdf = new Scanner(in);
     int d= asdf.nextInt();
     int x= asdf.nextInt();
     int y= asdf.nextInt();
     while(d!=0){
         String[][] mat = new String[d][d];
         int s = d/2;
         for (int i = 0; i < s; i++) {
             for (int j = 0; j < s; j++) {
                 if (i+j>=s-1) {
                     mat[i][j] ="/";
                     mat[d-i-1][j] ="\\";
                     mat[i][d-1-j] ="\\";
                     mat[d-i-1][d-1-j]="/";
                 }
                 else{
                    mat[i][j] ="#";
                     mat[d-i-1][j] ="#";
                     mat[i][d-j-1] ="#";
                     mat[d-i-1][d-j-1]="#"; 
                 }
             }
         }
//         for (int i = 0; i <x; i++) {
//             for (int j = 0; j < y; j++) {
//                 for (int k = 0; k < mat[0].length; k++) {
//                     for (int l = 0; l < mat.length; l++) {
//                         System.out.print(mat[k][l]);
//                     }
                     
//                 }
//                  System.out.println("");
//             }
            
//         }
         for (int z = 0; z < x; z++) {
             
         
             int c = 0;
             while(c<mat.length){
                 for (int i = 0; i < y; i++) {
                    for (int j = 0; j < mat[c].length; j++) {
                        System.out.print(mat[c][j]);
             
                    }
                 
                 
                }System.out.println("");
            c++;
                 
             
         }
         }
         d = asdf.nextInt();
         x = asdf.nextInt();
         y = asdf.nextInt();
     }
    }
    
}
