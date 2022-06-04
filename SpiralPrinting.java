import java.util.Scanner;

public class SpiralPrinting 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int [50][50];
		int i,j,m,n,k;
		System.out.println("Enter the number of Rows : ");
		m=sc.nextInt();
		System.out.println("Enter the number of Col : ");
		n=sc.nextInt();
		System.out.println("Enter the elements \n");
		for(i=0;i<m;i++)
		{
			System.out.println("Enter Elements of "+i+" Row");
			for(j=0;j<n;j++)
			{
				System.out.print("arr["+i+"]["+j+"] : ");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix ..........................................\n");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
