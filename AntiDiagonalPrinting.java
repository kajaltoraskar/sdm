import java.util.Scanner;

public class AntiDiagonalPrinting 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[50][50];
		int i,j,k,m,n;
		System.out.print("Enter the number of Rows");
		m=sc.nextInt();
		System.out.print("Enter the numberof Col");
		n=sc.nextInt();
		for(i=0;i<m;i++)
		{
			System.out.println("Enter the Elements of "+i+" Row");
			for(j=0;j<n;j++)
			{
				System.out.print("arr["+i+"]["+j+"] : ");
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("The Matrix .................................\n");

		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}

		System.out.println("AntiTraversal of Diagonal....................\n");
		for(k=0;k<(m+n)-1;k++)
		{
			for(i=0;i<m;i++)  // For Row Condition
			{
				for(j=0;j<n;j++) // For Coloumn Condition
				{
					if((i+j)==k)
					{
						if(k%2 == 0)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
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
	} // End of Main

}
