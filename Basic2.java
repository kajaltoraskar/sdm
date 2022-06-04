import java.util.Scanner;

public class Basic2 
{

	public static void main(String[] args) 
	{
		int i,j,n,m;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		n = sc.nextInt();
		int arr2[][] = new int[n][];
		for(i=0;i<arr2.length;i++)
		{
			System.out.println("Enter number of coloumns for i th row "+i);
			m = sc.nextInt();
			arr2[i] = new int[m];
		}
		
		for(i=0;i<arr2.length;i++)
		{
			for(j=0;j<arr2[i].length;j++)
			{
				arr2[i][j] = i + j ;
			}
		}
		
		Display_Arr2(arr2);
		sc.close();
	}
	
	static void Display_Arr2(int [][]a)
	{
		int i , j ;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
