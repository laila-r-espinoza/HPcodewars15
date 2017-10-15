
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * Laila Espinoza
 */
public class prob09 {


    public static void main(String[] args) {
        Scanner qwe = new Scanner(System.in);
        int x = qwe.nextInt();
        int y = qwe.nextInt();
        ArrayList<Integer> arr= new ArrayList();
        ArrayList<Integer> ara= new ArrayList();
        while(x!=0&&y!=0){
            if (!arr.contains(x)) {
                arr.add(x);
                ara.add(y);
                
            }
            else{
                int c = arr.indexOf(x);
                int k = ara.get(c);
                ara.set(c, k+y);
            }
            x = qwe.nextInt();
            y = qwe.nextInt();
        }
        ArrayList<Integer> v = new ArrayList();
        for (int i = 0; i < ara.size(); i++) {
            v.add(ara.get(i));
        }
        Collections.sort(v);
        Collections.reverse(v);
        
        for (int i = 0; i < 5; i++) {
            int l = ara.indexOf(v.get(i));
            System.out.println((i+1)+" "+arr.get(l)+" "+ara.get(l));
        }
    }
    
}
