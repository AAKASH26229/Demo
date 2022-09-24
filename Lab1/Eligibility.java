package Lab1;
import java.util.Scanner;
public class Eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int age;
		System.out.print("Enter age: ");
		age = s.nextInt();
		if(age>=18 && age<100) System.out.println("Eligible for voting");
		else                   System.out.println("Not eligible for voting");
	}

}
