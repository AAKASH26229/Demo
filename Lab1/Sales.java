package Lab1;
import java.util.Scanner;
public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sales; 
		System.out.println("Enter sales: ");
		sales = s.nextInt();
		if(sales > 10000) System.out.println("Eligible for bonus");
		else 			  System.out.println("Not eligible");
		int bonus= (sales * 20) / 100;
		System.out.println("Bonus is "+bonus);
		

	}

}
