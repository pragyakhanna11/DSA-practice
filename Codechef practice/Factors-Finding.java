/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn = new Scanner(System.in);
	    int N = scn.nextInt();
	    int count = 0;
	    for(int i = 1; i<=N; i++){
	        if(N%i==0) count++;
	        else continue;
	    }
	    System.out.println(count);
	    for(int i = 1; i<=N; i++){
	        if(N%i==0) System.out.print(i + " ");
	    }
		// your code goes here
	}
}
