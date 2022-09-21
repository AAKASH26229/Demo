package LoopAssignment;
/* A B C D
 * A B C
 * A B 
 * A
 * */
public class AB_InversePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		char r='A';
		for(i=1;i<=4;i++)
		{ r='A';
			for(j=4;j>=i;j--)
			{	System.out.print(r);
			    r++;
			}   
			System.out.println();
		}
	}

}
