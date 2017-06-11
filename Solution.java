import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int size = scan.nextInt();
       int rot = scan.nextInt();
       int t = scan.nextInt();
       //int[] a = new int[size];
       LinkedList <Integer> a = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            int element = scan.nextInt();
            a.add(element);
            
        }
        for (int i = 0; i < rot; i++) {
            a.addFirst(a.getLast());
            a.removeLast();
        }
        //System.out.println(a);
        while(t>0){
            t--;
            int postion = scan.nextInt();
            System.out.println(a.get(postion));
        }
       
    }
}
