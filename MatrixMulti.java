/*
 * File       :MatrixMulti.java
 * Description:Doing matrix multiplication
 * Author     :Sarya Sajeev
 * Version    :1.0
 * Date       :10-10-23
 */
import java.util.Scanner;
public class MatrixMulti {
	public static void main(String[]args) {
		int Row_Size1,Column_Size1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row Size and Column Size of the First Matrix");
		Row_Size1=sc.nextInt();
		Column_Size1=sc.nextInt();
		int [][]matrix1=new int[Row_Size1][Column_Size1];
		System.out.println("Enter the elements of the First Matrix");
		for(int i=0;i<Row_Size1;i++)
		{
			for(int j=0;j<Column_Size1;j++)
			{
			matrix1[i][j]=sc.nextInt();	
			}
		}
		for(int i=0;i<Row_Size1;i++)
		{
			for(int j=0;j<Column_Size1;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println("\n");
	}
		int Row_Size2,Column_Size2;
		System.out.println("Enter the Row Size and Column Size of the Second Matrix");
		Row_Size2=sc.nextInt();
		Column_Size2=sc.nextInt();
		int [][]matrix2=new int[Row_Size2][Column_Size2];
		System.out.println("Enter the elements of the Second Matrix");
		for(int i=0;i<Row_Size2;i++)
		{
			for(int j=0;j<Column_Size2;j++)
			{
			matrix2[i][j]=sc.nextInt();	
			}
		}
		for(int i=0;i<Row_Size2;i++)
		{
			for(int j=0;j<Column_Size2;j++)
			{
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println("\n");
	}
		int [][]matrix3=new int[Row_Size1][Column_Size2];
		if(Row_Size1!=Column_Size2) {
			System.out.println("Multiplication is not Possible");
		}
		else {
			System.out.println("The matrix after multiplication is");
			for(int i=0;i<Row_Size1;i++)
			{
				for(int j=0;j<Column_Size2;j++)
				{
					for(int k=0;k<Column_Size1;k++){
						 matrix3[i][j]=matrix3[i][j]+matrix1[k][j]*matrix2[i][k];
					}
				}
			}
			for(int i=0;i<Row_Size1;i++) {
				for(int j=0;j<Column_Size2;j++) {
					System.out.print(matrix3[i][j]+"\t");
				}
				System.out.println("\n");
				}
			}
		}
	}


