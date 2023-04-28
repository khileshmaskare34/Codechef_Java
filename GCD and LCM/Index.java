/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Index
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your index number");
		int t = sc.nextInt();
		for(int i = 0;i<t;i++){
		    long a = sc.nextInt();
		    long b = sc.nextInt();
		    
		    long gc = gcd(a,b); 
		   long lcm = (a*b)/gc;
		    System.out.println(gc+" "+lcm);
		}
	}
	
    static long gcd(long a, long b){
	    while(a != b){
	        if(a>b){
	            a = a-b;
	        }
	        else{
	            b = b-a;
	        }
	    }
	        return a;
	}

}