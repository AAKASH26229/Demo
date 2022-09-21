package Lab1;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("Enter number: ");
		num = s.nextInt();
		if(num % 2 == 0) System.out.println("Number is Even");
		else             System.out.println("Number is odd");
		
	}

}
