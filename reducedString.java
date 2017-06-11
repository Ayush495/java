import java.util.*;
 
public class reducedString {
 
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String s = stdin.nextLine();
        String acc = "";
        System.out.println("acc length"+acc.length());
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(acc.length() > 0 && acc.charAt(acc.length() - 1) == c) {
                acc = acc.substring(0, acc.length() - 1);
                System.out.println("under if"+acc);
               
            } else {
                acc += c;
                System.out.println("under else"+acc);
            }
        }
        System.out.println(acc.isEmpty() ? "Empty String" : acc);
        stdin.close();
    }
}