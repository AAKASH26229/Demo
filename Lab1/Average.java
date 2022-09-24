package Lab1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int subject[];    //declaring array
		subject = new int[5];  // allocating memory to array
		subject[0] = 40;
		subject[1] = 20;
		subject[2] = 50;
		subject[3] = 30;
		subject[4] = 10;
		int Avg;
		Avg = (subject[0]+subject[1]+subject[2]+subject[3]+subject[4]) / 5; 
		System.out.println("Average of 5 subject: "+ Avg);
		
	}

}
