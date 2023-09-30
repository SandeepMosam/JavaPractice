package LogicPrac;
import java.util.Scanner;

public class MultiRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println("Enter the number: "+n);
		if(n>=0)
		{
			for(int i=0;i>=n;i++)
			{
				System.out.println(" ");
				for(int j=0;j>=n;j++)
				{
					System.out.println(n);
				}
			}
		}

	}

}
