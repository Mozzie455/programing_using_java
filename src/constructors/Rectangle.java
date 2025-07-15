package constructors;

public class Rectangle {
    public float length;
    public float width;

    public double calculateArea(){
        return Math.round(length * width * 100.0)/100.0;
    }

    public double calculatePerimeter(){
        return Math.round((length + width) * 2 * 100.0)/100.0;
    }

}

class Tester {

    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle();
        //Assign values to the member variables of Rectangle class
         rectangle.length = 6f;
         rectangle.width = 3f;
        //Invoke the methods of the Rectangle class to calculate the area and perimeter
         double area = rectangle.calculateArea();
         double perimeter = rectangle.calculatePerimeter();
        //Display the area and perimeter using the lines given below
        System.out.println("Area of the rectangle is " + area);
        System.out.println("Perimeter of the rectangle is " + perimeter);
    }

}