import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class max_sub_array {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in =new Scanner(System.in);
        int query=in.nextInt();
        int arr_len=in.nextInt();
        int div=in.nextInt();
        int[] a=new int[arr_len];
        for(int i=0;i<query;i++){
            for(int j=0;j<arr_len;j++){
                a[j]=in.nextInt();
               // System.out.print(a[j]);
            }
            //System.out.print("hiii");
           max_sum(a,div);
        }
    }
    
    static void max_sum(int[] a,int div){
        //System.out.println("div"+div);
       int max_ending_here=0;
        int max_so_far=Integer.MIN_VALUE;
        for(int i:a){
           int max_end=max_ending_here + i;
        max_ending_here = Math.max(i%div,(max_end)%div); 
        max_so_far = Math.max(max_so_far, max_ending_here);
           // System.out.println(max_so_far);
        }
        System.out.println(max_so_far);
        
        
    }
}