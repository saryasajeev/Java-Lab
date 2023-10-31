/************************************************************
 *File       :Secondsmallest.java
 *Description:Finding reverse of a string
 *author     :sarya sajeev
 *version    :1.0
 *Date       :31/10/2023
************************************************************/
import java.util.Scanner;
public class Secondsmallest {
	public static void main(String[]args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
			size=sc.nextInt();
			int []array=new int[size];
			System.out.println("Enter the elements of the array");
			for(int i=0;i<size;i++)
			{
			array[i]=sc.nextInt();
			}
			for(int i=0;i<size;i++)
			{
				for(int j=i+1;j<size;j++)
				{
					if(array[j]<array[i])
					{
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
				
			}
			System.out.println("The Second smallest element in the array is:"+array[1]);
	}

}
