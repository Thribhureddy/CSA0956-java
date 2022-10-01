
import java.io.*;
import java.util.Scanner;

class invertedpyramid
{
	
public static void main (String[] args)
{
	int a = 7;  
	int i,j;
	
	for(i = a; i >= 1; i--)
	{
		
		for(j = i; j < a; j++)
		{
			System.out.print(" ");
		}
		
		
		for(j = 1; j <= (2 * i - 1); j++)
		{
			System.out.print("*");
		}
		
	
		System.out.println("");
	}
}
}
