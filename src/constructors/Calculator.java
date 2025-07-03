package constructors;

public class Calculator {
    public int num;
    
    public void sumOfDigit(){
        int sum = 0;
        while (num !=0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum of digits: " + sum);
    }
}

//class Tester{
//    public static void main(String[] args) {
//
//        Calculator calculator = new Calculator();
//
//        // Assign a value to the member variable num of Calculator class
//        calculator.num = 6547;
//        // Invoke the method sumOfDigits of Calculator class and display the output
//        calculator.sumOfDigit();
//
//    }
//}