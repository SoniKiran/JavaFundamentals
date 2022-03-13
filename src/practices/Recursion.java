package practices;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintReverseTillZero(10);
	}
	public static int PrintReverseTillZero(int num)
	{
		if(num!=0)
			System.out.println(PrintReverseTillZero(num-1));
		
		return 0;
	}
}
