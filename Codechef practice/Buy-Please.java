/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{Scanner scanner = new Scanner(System.in);
	String s[]= scanner.nextLine().split(" ");
	int a[];
	a = new int[5];
        for(int i =0 ;i < s.length;i++){
            a[i]= Integer.parseInt(s[i]);
        }
    System.out.println(a[0]*a[2] + a[1]*a[3]);
	}
}
