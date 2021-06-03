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
		int arr[];
		arr = new int[3];
	
		String s[]= scn.nextLine().split(" ");
        for(int i =0 ;i < s.length;i++){
            arr[i]= Integer.parseInt(s[i]);
        }
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        if(a>0&b>0&c>0&((a+b)>c)&((c+b)>a)&((a+c)>b)) {
            if(a==b& b==c) System.out.println(1);
            else if(a==b | b==c | c==a) System.out.println(2);
            else System.out.println(3);
        }
        else System.out.println(-1);
	}
}
