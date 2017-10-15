
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
public class prob10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner asdf = new Scanner(in);
    int z = asdf.nextInt();
    asdf.nextLine();
        for (int i = 0; i < z; i++) {
            String[] w = asdf.nextLine().split(" ");
            String ans = "";
            for (int j = 1; j < w.length; j++) {
                switch(w[j]){
                    case "81": ans+="a";break;
                    case "82": ans+="b";break;
                    case "83": ans+="c";break;
                    case "84": ans+="d";break;
                    case "85": ans+="e";break;
                    case "86": ans+="f";break;
                    case "87": ans+="g";break;
                    case "88": ans+="h";break;
                    case "89": ans+="i";break;
                    case "91": ans+="j";break;
                    case "92": ans+="k";break;
                    case "93": ans+="l";break;
                    case "94": ans+="m";break;
                    case "95": ans+="n";break;
                    case "96": ans+="o";break;
                    case "97": ans+="p";break;
                    case "98": ans+="q";break;
                    case "99": ans+="r";break;
                    case "A2": ans+="s";break;
                    case "A3": ans+="t";break;
                    case "A4": ans+="u";break;
                    case "A5": ans+="v";break;
                    case "A6": ans+="w";break;
                    case "A7": ans+="x";break;
                    case "A8": ans+="y";break;
                    case "A9": ans+="z";break;
                    case "C1": ans+="A";break;
                    case "C2": ans+="B";break;
                    case "C3": ans+="C";break;
                    case "C4": ans+="D";break;
                    case "C5": ans+="E";break;
                    case "C6": ans+="F";break;
                    case "C7": ans+="G";break;
                    case "C8": ans+="H";break;
                    case "C9": ans+="I";break;
                    case "D1": ans+="J";break;
                    case "D2": ans+="K";break;
                    case "D3": ans+="L";break;
                    case "D4": ans+="M";break;
                    case "D5": ans+="N";break;
                    case "D6": ans+="O";break;
                    case "D7": ans+="P";break;
                    case "D8": ans+="Q";break;
                    case "D9": ans+="R";break;
                    case "E2": ans+="S";break;
                    case "E3": ans+="T";break;
                    case "E4": ans+="U";break;
                    case "E5": ans+="V";break;
                    case "E6": ans+="W";break;
                    case "E7": ans+="X";break;
                    case "E8": ans+="Y";break;
                    case "E9": ans+="Z";break;
                    case "40": ans+=" ";break;
                    case "4B": ans+=".";break;
                    case "6B": ans+=",";break;
                    case "5A": ans+="!";break;
                }
            }
            System.out.println(ans);
        }
    }
    
}
