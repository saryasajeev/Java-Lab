package PACK1;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokens {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		String line=sc.nextLine();
		StringTokenizer string=new StringTokenizer(line);
		int num,sum=0;
		while(string.hasMoreTokens()) {
			num=Integer.parseInt(string.nextToken());
			sum=sum+num;
		}
		System.out.println("sum is "+sum);
		
			
	}
}
