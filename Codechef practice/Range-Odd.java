/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in);
		int a[];
		a = new int[4];
		String s[]= scn.nextLine().split(" ");
        for(int i =0 ;i < s.length;i++){
            a[i]= Integer.parseInt(s[i]);
        }
        for(int i = a[0]; i<=a[1]; i++){
            if(i%2!=0) System.out.print(i+" ");
        }
	}
}
