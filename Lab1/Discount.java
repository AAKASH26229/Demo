package Lab1;
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String Pname;
		Float Pprice;
		Float Dis;
		System.out.println("Enter Product name: ");
		Pname = s.nextLine();
		System.out.println("Enter Product price: ");
		Pprice = s.nextFloat();
		Float dis;
		if(Pprice > 2000) {
			dis = (Pprice * 10) / 100; 
			System.out.println("Discount on product: "+ dis);
		   }
		else { 
			dis = (Pprice * 7 ) / 100; 
			System.out.println("Discount on product: "+ dis);
		}
	}

}
