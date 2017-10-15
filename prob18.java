
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
public class prob18 {
     public static int sx = 0;
     public static int sy = 0;
     public static boolean p = true;
     public static boolean g(int x, int y,int[][] b){
         return (x<b.length&&x>=0&&y<b[0].length&&y>=0);
     }
    public static void solve(int x, int y, int[][] mat){
        if (mat[x][y]==-2) {
            print(mat);
            p = false;
        }
        else{
            int t = mat[x][y];
            if (g(x+1,y,mat)&&mat[x+1][y]<=mat[x][y]&&mat[x+1][y]!=-1) {
                mat[x][y] = -1;
                solve(x+1,y,mat);
            }
            if (p) {
                mat[x][y] = t;
            }
            if (g(x-1,y,mat)&&mat[x-1][y]<=mat[x][y]&&mat[x-1][y]!=-1) {
                mat[x][y] = -1;
                solve(x-1,y,mat);
            }if (p) {
                mat[x][y] = t;
            }
            if (g(x,y+1,mat)&&mat[x][y+1]<=mat[x][y]&&mat[x][y+1]!=-1) {
                mat[x][y] = -1;
                solve(x,y+1,mat);
            }if (p) {
                mat[x][y] = t;
            }
            if (g(x,y-1,mat)&&mat[x][y-1]<=mat[x][y]&&mat[x][y-1]!=-1) {
                mat[x][y] = -1;
                solve(x,y-1,mat);
            }
            if (p) {
                mat[x][y] = t;
            }
        }
    }
    public static void print(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i ==sx &&j==sy) {
                    System.out.print("S ");
                }
                else if (mat[i][j] ==-2) {
                    System.out.print("X ");
                }
                else if (mat[i][j]==-1) {
                    System.out.print(". ");
                }
                else System.out.print("# ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
     Scanner asdf = new Scanner(in);
     int x = asdf.nextInt();
     int y = asdf.nextInt();
     
     int[][] mat = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                char c = asdf.next().charAt(0);
                if (Character.isDigit(c)) {
                    mat[i][j] = Integer.parseInt(c+"");
                }
                if (c == 'S') {
                     sx = i;
                     sy = j;
                    mat[i][j] = 9;
                }
                if (c == 'X') {
                    mat[i][j] = -2;
                }
            }
        }
        solve(sx,sy,mat);
        
    }
    
}
