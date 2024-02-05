package lab1;
import java.util.*;

public class Palindromenumbers {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter integer value: ");
		int num=input.nextInt();
		int temp=0;
		int remainder=0;
		int sum=0;
		temp=num;
		
		while(num>0) {
			remainder=num%10;
			sum=(sum*10)+remainder;
			num=num/10;
		}
		if(temp==sum) 
		{
			System.out.println(temp +"is palindrome.");
			
		}else {
			System.out.println(temp +"is not palindrome");
		}
			
		input.close();
		

	}

}
