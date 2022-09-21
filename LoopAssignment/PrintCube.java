package LoopAssignment;
import java.util.Scanner;
public class PrintCube {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any two number:");
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		for(int i=n1;i<=n2;i++) {
			System.out.println("Cube of number "+i+ " is: " +i*i*i );
		}
	}

}
