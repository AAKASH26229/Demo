package LoopAssignment;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("The fibonacci Series till "+n+ " is: ");
		int first = 0;
		int second = 1;
		 for (int i = 0; i <= n; i++)
			 
		    {
			 
		    int third = first + second;
		     
		     System.out.print(first +",");
		 
		      first = second;
		 
		      second = third;
		 
		    }
			 
		}
	}

