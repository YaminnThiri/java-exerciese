package lab1;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i;
		int fact=1;
		System.out.println("Enter the factorial number");
		int number=input.nextInt();
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of"+number+"is:"+fact);
		input.close();
		
		
	}	
	
}