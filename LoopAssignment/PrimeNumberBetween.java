package LoopAssignment;
import java.util.Scanner;
public class PrimeNumberBetween {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers you want prime number in between  ");
		System.out.print("Enter first number: ");
		int n1= s.nextInt();
		System.out.print("Enter second number: ");
		int n2= s.nextInt();
		System.out.print("Prime numbers are:");
		for(int i=n1;i<=n2;i++)
		{	
			int b=1; 
            int c=0; 
             while(b<=i) 
                { 
                    if((i%b)==0) 
                       c=c+1; 
                       b++; 
                } 
                 if(c==2) 
                 System.out.print(" " +i);
		}
	}

}
