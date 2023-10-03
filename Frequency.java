import java.util.Scanner;

/************************************************************
 *File       :Palindrome.java
 *Description:Finding frequency of a string
 *author     :sarya sajeev
 *version    :1.0
 *Date       :03/10/2023
************************************************************/
public class Frequency {
	public static void main(String[]args) {
		String sentence;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		sentence=sc.nextLine();
		System.out.println("Enter a character to be checked");
		 char character=sc.next().charAt(0);
		int frequency=Freq(sentence,character);
		if(frequency==0) {
			System.out.println("The character is not present in the string");
		}
		else {
		System.out.println("The no of occurences of the character is "+frequency);
		}
		
	}
	static int Freq(String sentence,char Character) {
		char[]charArray=sentence.toCharArray();
		int Strlength=sentence.length(),count=0;
		for(int i=0;i<Strlength;i++){
			if(charArray[i]==Character)
			{
				count++;
			}
		}
		return count;
	}

}
