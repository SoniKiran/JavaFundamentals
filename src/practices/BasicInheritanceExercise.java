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

import java.util.Calendar;

public class BasicInheritanceExercise
{
    public static void main(String[] args)
    {
    	Employee e= new Employee();
    	e.setName("Kiran bhushan khajone");
    	e.getEmployee();
    	Employee kiran=new Employee("kiran khajone",123545, 2022,"52361");
    	
    	kiran.getEmployee();
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
		
	class Employee extends Person
	{
		private double annualSalary;
		private int joiningYear;
		private String nationalInsuranceNum;
		
		public Employee()
		{
			this.annualSalary=0;
			this.joiningYear=2022;
			this.nationalInsuranceNum="00000";
		}
		public Employee(String name,double salary,int joinig, String insuranceNumber)
		{
			
			super(name);
			
			this.annualSalary=salary;
			this.joiningYear=joinig;
			this.nationalInsuranceNum=insuranceNumber;
		}
		public void getEmployee() 
		{
			System.out.println("Emplyee name:"+getName());

			System.out.println("Emplyee annual salary:"+annualSalary);
			System.out.println("Emplyee joining year"+joiningYear);
			System.out.println("Emplyee national insurance number:"+nationalInsuranceNum);
		}
		
		
		
		
	
	
	
	
	}
	
	