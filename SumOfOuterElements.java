
public class SumOfOuterElements 
{
	// Sum of Outer elements of Square Matrix

	static int sum=0;
	
	public static void main(String[] args) 
	{
		int arr[][]= new int[10][10];
		int i , j ;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j]=i+j;
			}
		}
		Display(arr);
		System.out.println("\nPrinting Outer elements ...");
		int res = PrintOuterElements(arr);
		System.out.println("\nThe sum of Outer elements of Square Matrix : "+res);
		
	} /// End of main class

	static void Display(int [][]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	static int PrintOuterElements(int [][]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==0||i==arr.length-1||j==0||j==arr[i].length-1)
				{
					System.out.print(arr[i][j]+" ");
					sum = sum + arr[i][j];
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		return sum;
	}

}
