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
		int n = scn.nextInt();
		for(int i = 1; i <=n; i++){
		    if (i%2!=0){
		        for (int j = (i*5)-4;j<=i*5 ;j++ ) {System.out.print(j+ " "); 
		    }}
		    else{
		        for (int k = (i*5);k>=(i*5)-4 ;k-- ) {System.out.print(k+ " "); 
		          
		        }
		    }System.out.println(""); 
	}
}}
