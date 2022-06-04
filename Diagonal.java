import java.util.Scanner;

public class Diagonal 
{
	static int sum=0;
	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements of Square matrix");
		int arr[][]= new int [5][5];
		int i , j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		Display(arr);
		System.out.println("Printing Diagonal Elements");
		int res = PrintDigonal(arr);
		System.out.println("The Sum of Digonal Elements : "+sum);
		
		sc.close();

	} // End of Main 

	static int PrintDigonal(int [][]brr)
	{
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				if(i==j)
				{
					sum = sum +brr[i][j];
					System.out.print("   "+brr[i][j]);
				}
				else
				{
					System.out.println("   ");
				}
				
			}
		}
		System.out.println();
		return sum;
	}

	static void Display(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}

	}

} // End of class
