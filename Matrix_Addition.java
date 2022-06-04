import java.util.Scanner;

public class Matrix_Addition 
{
	int mat[][];

	public Matrix_Addition(int n , int m) // Parameterised Constructor of class Matrix_Addition
	{
		mat= new int[n][m];
	
	}
	
	void Accept_Matrix()
	{
		Scanner sc = new Scanner(System.in);
		int i , j ;
		for(i=0;i<mat.length;i++)
		{
			for(j=0;j<mat[i].length;j++)
			{
				mat[i][j]= sc.nextInt();
			}
		}
		sc.close();
	}
	
	public String toString()
	{
		String str = new String(" ");
		int i , j ;
		for(i=0;i<mat.length;i++)
		{
			for(j=0;j<mat[i].length;j++)
			{
				str = str + str[i][j];
			}
			str=str+"\n";
		}
		
		
		return str;
	}
	

}
