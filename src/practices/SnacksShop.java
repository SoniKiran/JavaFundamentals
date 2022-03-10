package practices;

//Program for conditional understanding
class SnacksShop
{
	public static void main(String [] args)
	{
		Snack snack=new Snack(true, true,true);
		System.out.println("Entered in shop.");
		if(snack.IsBurgerPresent)
		{
			if(snack.IsPepsiPresent)
			{
				if(snack.IsColaPresent)
				{
					snack.drinkCola();
					snack.eatBurger();
					snack.drinkPepsi();
					snack.updateBillAmount(490);
				}
				else
				{
					snack.eatBurger();
					snack.drinkPepsi();
					snack.updateBillAmount(160);
				}
			}
			else if(snack.IsColaPresent)
			{
				snack.eatBurger();
				snack.drinkCola();
				snack.updateBillAmount(350);
			}
			else
			{
				snack.eatBurger();
				snack.updateBillAmount(60);
			}
		}
		else
		{
			snack.eatSandwitch();
			snack.updateBillAmount(50);
		}
		System.out.println("Your bill is: Rs."+ snack.getBillAmount());
	}
}

class Snack
{
	public boolean IsBurgerPresent;
	public boolean IsPepsiPresent;
	public boolean IsColaPresent;
	private int billAmount;
	Snack(boolean isBurgerPresent, boolean isPepsiPresent,boolean isColaPresent)
	{
		this.IsBurgerPresent=isBurgerPresent;
		this.IsPepsiPresent=isPepsiPresent;
		this.billAmount = 0;
		this.IsColaPresent=isColaPresent;
	}
	
	void eatBurger()
	{
		System.out.println("Give me burger.");
	}
	void drinkPepsi()
	{
		System.out.println("Give me pepsi.");
	}
	void drinkCola()
	{
		System.out.println("Give me Cola.");
	}
	void eatSandwitch()
	{
		System.out.println("Give me sandwitch.");
	}
	void updateBillAmount(int amount)
	{
		billAmount=+amount;
	}
	int getBillAmount()
	{
		return billAmount;
	}
}

