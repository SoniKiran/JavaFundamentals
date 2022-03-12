package practices;

public class MultiplicationWithDoWhile 
{
	public static void main(String[] args)
	{
		int a=5, b=6, i = 0, c = 0;
	
		do
		{
			c = c + a ;
			i++;
		}
		while(i < b);
	
		System.out.println("The product of these numbers is "+ c);
	}

}
