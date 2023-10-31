/************************************************************
 *File       :Transpose.java
 *Description:To find the transpose of a given matrix
 *author     :sarya sajeev
 *version    :1.0
 *Date       :31/10/2023
************************************************************/
import java.util.Scanner;
public class Transpose {
	public static void main(String[]args) {
		int Row_size,Column_size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size and column size size of the matrix");
		Row_size=sc.nextInt();
		Column_size=sc.nextInt();
		int [][]matrix=new int[Row_size][Column_size];
		System.out.println("Enter the elements of the First Matrix");
		for(int i=0;i<Row_size;i++)
		{
			for(int j=0;j<Column_size;j++)
			{
			matrix[i][j]=sc.nextInt();	
			}
		}
		for(int i=0;i<Row_size;i++)
		{
			for(int j=0;j<Column_size;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n");
	}
		for(int j=0;j<Row_size;j++)
		{
			for(int i=0;i<Column_size;i++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n");
	}	
	}

}
