/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;  
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn = new Scanner(System.in); 
	    int N = scn.nextInt();
	    if(N%5==0 & N%11==0) System.out.println("BOTH");
	    else if(N%5==0 | N%11==0) System.out.println("ONE");
	    else System.out.println("NONE");
		// your code goes here
	}
}
