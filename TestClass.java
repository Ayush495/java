/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
import java.lang.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
    Scanner s = new Scanner(System.in);
    int a=0;
    int r=0;
    int n=0;
    int T = s.nextInt();
    double pow=0.0;
    int ans=0;
    int convert=0;
    int modulo=0;
    for(int i=0;i<T;i++){
         n=s.nextInt();
         r=s.nextInt();
        pow=Math.pow(2,r);
        a=(fact(n)/(fact(n-r)*fact(r)));
        convert=(int) pow*a;
        System.out.println(convert);
        }
    }
    public static int fact(int num)
    {
    int fact=1,i;
    for(i=1;i<=num;i++)
    fact=fact*i;
    return fact;
    }        
        
        
}
