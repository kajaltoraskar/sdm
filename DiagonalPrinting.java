import java.util.Scanner;

public class DiagonalPrinting 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[50][50];
		System.out.println("Enter the number of Rows");
		int n =sc.nextInt();
		System.out.println("Enter the Number of Col");
		int m =sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Elements of "+(i+1)+" Row ");
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The elements are ");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}
		
		System.out.println("Diagonal Printing ................\n");
		
		for(int k =0;k<m+n-1;k++) 
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if((i+j)==k)  //  Checking the sum of index of col and row equals to Sum of their index
					{	
						if(k%2!=0)
						{
							System.out.print(arr[i][j]+"  ");
						}
						else
						{
							System.out.print(arr[j][i]+"  ");
						}
					}
				}
			}
			System.out.println();
		}
		

		sc.close();
	}

	
}
