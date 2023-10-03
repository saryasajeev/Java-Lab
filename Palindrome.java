/************************************************************
 *File       :Palindrome.java
 *Description:Finding palindrome of a string
 *author     :sarya sajeev
 *version    :1.0
 *Date       :03/10/2023
************************************************************/
import java.util.Scanner;
public class Palindrome {
	public static void main(String[]args) {
		String Character;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		Character=sc.next();
		boolean isPalindrome=Check(Character);
		if (isPalindrome) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
	}
		static boolean Check(String Character) {
			char[]charArray=Character.toCharArray();
			int Strlength=Character.length();
			for(int i=0;i<Strlength/2;i++){
				if(charArray[i]==charArray[Strlength-i-1])
				{
					return false;
				}
				return true;
			}
			return false;
		}

		
	}

	
	
	

