import java.util.*;
public class Iterator1{
public static void main(String args[]){
	String rev=" ";
	String s1=new String(" welcome to banglore ");
String [] words=s1.split(" ");
for(String a:words){
	 rev=a+" "+rev;}
	 
String s2=s1.toLowerCase().trim();
if(rev.trim().equals(s2))
	System.out.print("it's pallindromic string");
else
	System.out.print("not pallindromic");
}}



