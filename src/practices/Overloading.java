package practices;

public class Overloading {
    public static void main(String[] a) {
        Area area = new Area();
        area.calculateArea(5.6f); //Java knows which method to call on compile time itself.
        area.calculateArea(7f, 5.6f); //Hence Method overloading is also called compile-time polymorphism
    }
}

class Area
{
    //Following two methods have same name but different signatures(difference in parameter)
    //This is method overloading
    void calculateArea(float radius)
    {
        System.out.println("Area of circle is: " + (3.14 * radius * radius));
    }

    void calculateArea(float length, float bredth)
    {
        System.out.println("Area of reactangle is: " + (length*bredth));
    }
}