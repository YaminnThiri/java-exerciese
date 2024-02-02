package Testing;
	import java.util.Scanner;
public class Addition {
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		int numb1;
		int numb2,sum;
		
		
		System.out.print("Enter first integer");
		numb1=input.nextInt();
		
		System.out.print("Enter second integer");
		numb2=input.nextInt();
		
		sum=numb1+numb2;
		System.out.printf("Sum is %d \n", sum);
		
	}
		

}
