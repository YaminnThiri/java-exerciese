package lab1;
import java.util.*;

public class Evenodd 
{
	public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	int i;
	System.out.println("Enter an integer value");
	
	i=input.nextInt();
	if(i%2==0) {
		System.out.println("You entered number is enen");
	}else 
	{
		System.out.println("You entered number is odd");
	}
}
}