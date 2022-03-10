package practices;
public class Month{
	public static void main(String args[])
	{
		System.out.println(numOfDaysEfficiently(5));
	}
//Example of bad logic
static int numOfDays(int monthNo)
{
if(monthNo==1)
return 31;
else if(monthNo==2)
return 28;
else if(monthNo==3)
return 31;
else if(monthNo==4)
return 30;
else if(monthNo==5)
return 31;
else if(monthNo==6)
return 30;
else if(monthNo==7)
return 31;
else if(monthNo==8)
return 31;
else if(monthNo==9)
return 30;
else if(monthNo==10)
return 31;
else if(monthNo==11)
return 30;
else if(monthNo==12)
return 31;
else return 0;
}

static int numOfDaysEfficiently(int monthNo)
{
	int numOfDays;
	switch(monthNo)
	{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		numOfDays = 31;
		break;
		
		case 4:
		case 6:
		case 9:
		case 11:
		numOfDays = 30;
		break;
		
		case 2:
		numOfDays = 28;
		break;
		
		default:
		numOfDays = 0;
	}
	return numOfDays;
}

}