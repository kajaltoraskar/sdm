
public class Basic 
{
	// Version - 1
	
	public static void main(String[] args) 
	{
		int arr[][]=new int[5][5];
		int i , j ;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j]=i+j;
			}
		}
		
		Display_Arr(arr);
		sc.close();

	}
	
	static void Display_Arr(int [][]a)
	{
		int i ,j ;
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
