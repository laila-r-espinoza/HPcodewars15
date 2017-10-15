
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Laila
 */
public class prob03 {


    public static void main(String[] args) {
    Scanner asdf = new Scanner(in);
    int x = asdf.nextInt();
    String s ="";
    switch (x){
        case 1: s = "one";break;
        case 2: s = "two";break;
        case 3: s = "three";break;
        case 4: s = "four";break;
        case 5: s = "five";break;
        case 6: s = "six";break;
        case 7: s = "seven";break;
        case 8: s = "eight";break;
        case 9: s = "nine";break;
        case 10: s = "ten";break;
    }
        System.out.println("Number "+s+" is alive!");
    }
    
}
