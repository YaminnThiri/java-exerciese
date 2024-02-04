package lab1;
import java.util.*;

public class Square {

	public static void main(String[] args) {
	int x;
	int s;
	int f;
	int r=0;
	int y=1;
	int z=1;
	int j=1;
	
	Scanner input=new Scanner(System.in);
	System.out.printf("Please enter an integr:");
	x=input.nextInt();
	s=x+2;
	f=x-2;
	
	while(y<=x)
	{
		System.out.printf("*");
		y++;
	}
	
	while(r<f)
	{
		System.out.printf("\n*");
		while(z<=f) 
		{
			System.out.print(" ");
			z++;
		}	
		System.out.print("*");
		r++;
		z=1;
	}
	
	System.out.print("\n");
	
	if(x>1) 
	{
		while(j<=x) 
		{
			System.out.printf("*");
			j++;
		}
		System.out.printf("\n");
	}else {
		System.out.printf("\n");
	
	}input.close();

	}
	
}
