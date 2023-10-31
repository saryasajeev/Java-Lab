/************************************************************
 *File       :Reverse.java
 *Description:Finding reverse of a string
 *author     :sarya sajeev
 *version    :1.0
 *Date       :30/10/2023
************************************************************/
import java.util.Scanner;
public class Reverse {
	public static void main(String[]args) {
		String Character;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		Character=sc.next();
		char[]charArray=Character.toCharArray();
		int Strlength=Character.length();
		for( int i=Strlength-1;i>=0;i--)
		{
		System.out.println(charArray[i]);
		}

}
}