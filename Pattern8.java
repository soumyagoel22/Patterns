
import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		int row,col,val;
		row=0;
		val=1;
		while(row<n)
		{
			col=0;
			val=1;
			while(col<=row)
			{
				System.out.print(val+"\t");
				val=(val*(row-col))/(col+1);
				col=col+1;
			}
			System.out.println();
			row=row+1;
		}
		
	}

}
