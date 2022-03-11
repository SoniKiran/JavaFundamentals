/*
Problem Statement:
Write program for Snacks shop where, If shop has burger, pepsi and cola available serve all and update bill.
If burger and pepsi available serve burger and pepsi and update bill.
If burger and cola available serve burger and cola and update bill.
If only burger available, serve only burger and update bill.
if burger also not available serve sandwitch and update bill.

*/
package practices;

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

class Snack  //NOTE: This class has default access specifier as package private. This class will be accessible every where accross the package.
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

