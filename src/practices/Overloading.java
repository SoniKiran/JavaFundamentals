package practices;

public class Overloading {
    public static void main(String[] a) {
        Area area = new Area();
        area.calculateArea(5.6f);
        area.calculateArea(7f, 5.6f);
    }
}

class Area {
    void calculateArea(float radius) {
        System.out.println("Area of circle is: " + (3.14 * radius * radius));
    }

    void calculateArea(float length, float bredth){
        System.out.println("Area of reactangle is: " + (length*bredth));
    }
}