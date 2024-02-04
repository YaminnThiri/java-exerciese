package lab1;

public class Prime {

	public static void main(String[] args) {
		
		System.out.println("Prime numbers from 1 to 100");
		for(int i=2;i<=100;i++)
			{
				if(isPrime(i))
				{
					System.out.println(i);
				}
			}
	}
		
	public static boolean isPrime(int num) 
	{
		if(num<=1)
		{ 
			return false;
		}
		for(int i=2;i<=num/2;i++)
		{
			if((num%i)==0)
			{
				return false;
			}
		}
		return true;
		}

}


