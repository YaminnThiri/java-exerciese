package Testing;
import java.util.Scanner;

public class Operator {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		
		int numb1,numb2,sum,sub,multi, divi;
		
		System.out.print("Enter first integer");
		numb1=input.nextInt();
		System.out.print("Enter second integera");
		numb2=input.nextInt(); 
		
		sum=numb1+numb2;
		sub=numb1-numb2;
		multi=numb1*numb2;
		divi=numb1/numb2;
		
		System.out.printf("Sum is %d\n",sum);
		System.out.printf("substrion is %d \n",sub);
		System.out.printf("Multiplying is %d \n ",multi);
		System.out.printf("division is %d \n ",divi);
	
	}

}
