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
		scn.nextLine();
		int a[], rev[];
		a = new int[N];
		String s[]= scn.nextLine().split(" ");
        for(int i =0 ;i < s.length;i++){
            a[i]= Integer.parseInt(s[i]);
        }
        for (int i = 0; i < a.length; i++) {
        System.out.print(a[a.length-1-i] + " ");}
	}
}
