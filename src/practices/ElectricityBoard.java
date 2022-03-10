package practices;
/*
Write a java function that accepts electricity units as parameter and calculate and return total electricity bill according to the given condition:
For first 50 units Rs. 6.0/unit
For next 100 units Rs. 7.25/unit
For next 100 units Rs. 9.0/unit
For unit above 250 Rs. 11.50/unit
An additional surcharge of 20% is added to the bill.
*/
import java.util.*;
public class ElectricityBoard
{
	public static void main(String[] a)
	{
		Scanner sd= new Scanner(System.in);
		System.out.println("Enter Units: ");
		int unitsConsumed=sd.nextInt(); //ToDo: Accept input from user 
		System.out.println("Total electricity bill for "+unitsConsumed+" units is: Rs."+ CalculateElectricityBill(unitsConsumed));		
	}
	public static double CalculateElectricityBill(int unitsConsumed)
	{
		double billAmount=0;
		int uncalculatedUnits=unitsConsumed;
		
		if(unitsConsumed>250)
		{
			int unitsToCalculate=uncalculatedUnits-250;
			billAmount+=(uncalculatedUnits-250)*11.5;
			uncalculatedUnits-=unitsToCalculate;
		}
		if(uncalculatedUnits>150)
		{
			int unitsToCalculate=uncalculatedUnits-150;
			billAmount+=(uncalculatedUnits-150)*9.0;
			uncalculatedUnits-=unitsToCalculate;
		}
		if(unitsConsumed>50)
		{
			int unitsToCalculate=uncalculatedUnits-50;
			billAmount+=(uncalculatedUnits-50)*7.25;
			uncalculatedUnits-=unitsToCalculate;
		}
		
		billAmount+=uncalculatedUnits*6.00;
		
		billAmount = billAmount+ (billAmount*0.2);
		return billAmount;
	}
	
}