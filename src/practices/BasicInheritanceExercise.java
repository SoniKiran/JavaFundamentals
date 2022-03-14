/*
Problem Statement:
Create a class called Employee whose objects are records for an employee.
This class will be a derived class of the following written class Person.
An employee record has an employee's name (inherited from the class Person),
an annual salary represented as a single value of type double,
a year the employee started work as a single value of type int and a national insurance number, which is a value of type String.

Your class should have a reasonable number of constructors and accessor methods, as well as an equals method.
Write a suitable code in a main method to fully test your class definition.
*/


package practices;

public class BasicInheritanceExercise
{
    public static void main(String[] args)
    {

    }
}

class Person
{
	private String name;

	public Person()
	{
		this.name = "No name yet.";
	}
	public Person(String name)
	{
		this.name = name;
	}
	public void setName(String newName)
	{
		this.name = newName;
	}
	public String getName()
	{
		return this.name;
	}
	public void print()
	{
		System.out.println("Name: " + this.name);
	}
	public boolean equals(Person p)
	{
		return this.name.equals(p.name);
	}
}