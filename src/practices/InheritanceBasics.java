package practices;

public class InheritanceBasics {

	public static void main(String[] args)
	{
		Parent parent=new Parent("Ompho Dadi");
		parent.accessible();
		Child child=new Child("Ompho Dadaji");
		child.printXyz();
		child.accessible(); // This is method inherited from parent class Parent
		//child.printAbc();
	}
}

class Parent
{
	private String name;
	
	 Parent(String name)
	 {
		 this.name=name;
	 }
	
	String getName()
	{
		return this.name;
	}
	void accessible() {
		System.out.println("I Love You!!");
	}
	private void printAbc() {
		System.out.println("I Love You too!!");
	}
}

final class anotherParent //Since this class is declared with keyword final, this class cannot be inherited into another class.
{
	void accessible()
	{

	}
}

class Child extends Parent //Keyword extends in used to inherit parent class into child class
{
	//When some class is inherited into child class, child class has its own properties as well properties shared by its parent class.
	Child(String name)
	{
		super(name); //When parent class present parameterisez constructor it is must for child class to call a parent class constructor with super keyword from its own constructor
	}
	void printXyz()
	{
		System.out.println("But You hate me!!");
	}
}