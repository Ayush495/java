import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Paragraphtosentences {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        StringTokenizer st = new StringTokenizer(s," .?!\"",true);
        String lastToken = st.nextToken();
        String thisToken = null;
        String[] titles = {"Dr", "Mr", "Ms", "Mrs"};
        boolean found = false;
        boolean title = false;
        int inc = 0;
        while (st.hasMoreTokens()) {
            thisToken = st.nextToken();
            if (thisToken.equals("\"") || thisToken.equals("\'")){
                System.out.print(lastToken);
                found = false;
            }else if (thisToken.equals(".") || thisToken.equals("?") || thisToken.equals("!")){
                if (title && inc <= 3){
                    System.out.print(lastToken);
                }else{
                    System.out.print(lastToken);
                    found = true;
                    title = false;
                    inc = 0;
                }
            }else{
                if (title == true){
                    inc++;
                }
                if (thisToken.equals("Dr") || thisToken.equals("Mr") || thisToken.equals("Ms") || thisToken.equals("Mrs")){
                    title = true;
                }
                if (found == true){
                    System.out.println(lastToken);
                }else{
                    System.out.print(lastToken);
                }
                found = false;
            }
            lastToken = thisToken;
        }
        System.out.println(lastToken);
    }
}