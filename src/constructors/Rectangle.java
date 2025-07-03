package constructors;

public class Rectangle {
    public float length;
    public float width;

    public double calculateArea(){
        return (double) length * width;
    }

    public double calculatePerimeter(){
        return (double) (length + width) * 2;
    }

}

class Tester {

    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle();
        //Assign values to the member variables of Rectangle class
         rectangle.length = 12f;
         rectangle.width = 5f;
        //Invoke the methods of the Rectangle class to calculate the area and perimeter
         rectangle.calculateArea();
         rectangle.calculatePerimeter();
        //Display the area and perimeter using the lines given below
        System.out.println("Area of the rectangle is " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle is " + rectangle.calculatePerimeter());
    }

}