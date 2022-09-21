package Lab1;
import java.util.Scanner;
public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter 1st number: ");
		num1 = s.nextInt();
		System.out.println("Enter 2st number: ");
		num2 = s.nextInt();
		if(num1>num2) System.out.println(num1 +" is greater");
		else 		  System.out.println(num2 +" is greater");
	}

}
