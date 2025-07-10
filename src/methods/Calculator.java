package methods;
/*
Method Description
findAverage()
* Calculate the average of three numbers
* Return the average rounded off to two decimal digits

 */
class Calculator {
    public int num1;
    public int num2;
    public int num3;

    public double findAverage(int number1, int number2, int number3) {
        double average = (double)(number1 + number2 + number3) / 3;
        return Math.round(average * 100.0)/ 100.0;
    }
}
class Tester{
    public static void main(String[] args) {
        //Object creation
        Calculator calculator = new Calculator();
        calculator.num1 = 12;
        calculator.num2 = 8;
        calculator.num3 = 15;
        double average = calculator.findAverage(calculator.num1, calculator.num2, calculator.num3);
        System.out.println(average);
    }
}

