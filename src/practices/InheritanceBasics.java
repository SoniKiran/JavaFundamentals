package practices;

public class InheritanceBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child("Ompho Dadaji");
		child.printXyz();
		child.accessible();
		//child.printAbc();
	}
}
//Keyword final and super


class Parent
{
	private String name;
	
	 Parent(String name)
	 {
		 this.name=name;
	 }
	
	String getName(){
		return this.name;
	}
	void accessible() {
		System.out.println("I Love You!!");
	}
	private void printAbc() {
		System.out.println("I Love You too!!");
	}
}

class Child extends Parent{
	
	Child(String name)
	{
		super(name);
	}
	void printXyz() {
		System.out.println("But You hate me!!");
	}
}