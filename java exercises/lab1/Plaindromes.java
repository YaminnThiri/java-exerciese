package lab1;

public class Plaindromes {

	public static void main(String[] args) {
		
		String string="level";
		boolean flag=true;
		for(int i=0;i<string.length()/2;i++)
		{
			if(string.charAt(i)!=string.charAt(string.length()-i-1))
			{
				flag=false;
				break;
				
			}
		}
		
		if(flag)
		{
			System.out.println("Given string is plaindrome");
		}else
		{
			System.out.println("Given sring is not plaindrome");
		}

	}

}
