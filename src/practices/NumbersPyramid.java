package practices;

/*
Write Program using for, while for following patterns
------------------
Pyramid one
*****        done with for and while
****
***
**
*

-----------------
Pyramid two
done with for and while

*
**     
***
****
*****
------------------
Pyramid Three
    *
   **
  ***
 ****
*****
------------------
Pyramid Four
*****
 ****
  ***
   **
    *
------------------
Pyramid Five Done with for
1
12
123
1234
12345
------------------
Pyramid Six Done with for
5
54
543
5432
54321
------------------
Pyramid Seven
1
22
333
4444
55555
------------------
Pyramid Eight
54321
 4321
  321
   21
    1
*/
public class NumbersPyramid {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//pyramidOneWithFor();
		//System.out.println("--------------------------");
		//pyramidTwoWithFor();
		//System.out.println("--------------------------");
		//pyramidOneWithWhile();
		//System.out.println("--------------------------");
		//pyramidTwoWithWhile();
		//pyramidFiveWithFor();
		//System.out.println("--------------------------");
		//pyramidSixWithFor();
		//System.out.println("--------------------------");
		//pyramidSevenWithFor();
		pyramidEightWithFor();
  	}
	static void pyramidOneWithFor()
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=i;j<=5;j++)

			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	static void pyramidTwoWithFor()
	{
		for (int i=5;i>=1;i--)
		{
			for (int j=i;j<=5;j++)

			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	static void pyramidOneWithWhile()
	{
		int i=1;

		while (i<=5)
		{
			int j=i;
			while(j<=5)
				
			{
				
				System.out.print("*");
				j++;
			}
			
			System.out.println();
			i++;
		}
	}
	static void pyramidTwoWithWhile()
	{
		int i=5;
		while (i>=1)
		{
			int j=i;
			while (j<=5)

			{
				System.out.print("*");
				j++;
			}
			
			System.out.println();
			i--;
		}
	}
	static void pyramidFiveWithFor()
	{
		
		for(int n=1;n<=5;n++){
			
			for(int m=1;m<=n;m++){
				System.out.print(m);
			}
			System.out.println();
		}
	}
	static void pyramidSixWithFor()
	{
		
		for(int n=5;n>=1;n--)
		{
			for(int m=5;m>=n;m--){
				System.out.print(m);
			}
			System.out.println();
		}
	}
	static void pyramidSevenWithFor()
	{
		
		for(int n=1;n<=5;n++){
			
			for(int m=1;m<=n;m++){
				System.out.print(n);
			}
			System.out.println();
		}
	}
	
	static void pyramidEightWithFor()
	{
		for (int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
				
			}
			for (int j=1;j<=i;j++)

			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
			
		
	}
	

