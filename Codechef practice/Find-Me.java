/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{try{
		// your code goes here
		Scanner scn = new Scanner(System.in);
		int a[], b[];
		a = new int[20];
	
		String s[]= scn.nextLine().split(" ");
        for(int i =0 ;i < s.length;i++){
            a[i]= Integer.parseInt(s[i]);
        }
        	b = new int[a[0]];
        String t[]= scn.nextLine().split(" ");
        for(int i =0 ;i < t.length;i++){
            b[i]= Integer.parseInt(t[i]);
        }
        boolean c = false;
        for(int i=0; i<a[0]; i++){
            if(b[i]==a[1]){
                c= true;
            }
        }
        if(c) System.out.println(1);
        else System.out.println(-1);
	}catch(Exception e){
			return;
		}
	}
}
