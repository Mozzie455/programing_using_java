package methods;

class Calculator {
    public void findAverage(int number1, int number2, int number3) {
        System.out.println("Calculating final amount to be paid.....");
        double average =(double) (number1 + number2 + number3) / 3;
        System.out.format("%.2f", average);
    }
}
class Tester{
    public static void main(String[] args) {
        //Object creation
        Calculator calculator = new Calculator();
        int num1 = 12, num2 = 8, num3 = 15;
        calculator.findAverage(num1, num2, num3);
    }
}

