
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
public class prob12 {

     public static double h(double s, double d){
         double a = Math.abs(d-s);
         double b = 1;
         double c = Math.sqrt(a*a+1);
         return Math.toDegrees(Math.asin(a/c));
     }
     public static double d(double s, double d){
         double a = Math.abs(d-s);
         double b = Math.sqrt(2);
         double c = Math.sqrt(a*a+2);
         return Math.toDegrees(Math.asin(a/c));
     }
     public static boolean g(int x, int y,int b){
         return (x<b&&x>=0&&y<b&&y>=0);
     }
    public static void main(String[] args) {
    Scanner asdf = new Scanner(in);
    int z = asdf.nextInt();
    double[][] mat = new double[z][z];
        for (int i = 0; i <z; i++) {
            for (int j = 0; j < z; j++) {
                mat[i][j] = asdf.nextDouble();
            } 
        }
        
        double ans = 0.0;
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < z; j++) {
                if (g(i-1,j+1,z)) {
                   double t= d(mat[i][j],mat[i-1][j+1]);
                    if (t>ans) {
                        ans = t;
                    }
                }
                if (g(i,j+1,z)) {
                   double t= h(mat[i][j],mat[i][j+1]);
                    if (t>ans) {
                        ans = t;
                    }
                }
                if (g(i+1,j+1,z)) {
                   double t= d(mat[i][j],mat[i+1][j+1]);
                    if (t>ans) {
                        ans = t;
                    }
                }
                if (g(i+1,j,z)) {
                   double t= h(mat[i][j],mat[i+1][j]);
                    if (t>ans) {
                        ans = t;
                    }
                }
            }
        }
        System.out.println("Max angle is "+ans+" degrees.");
    }
    
}
