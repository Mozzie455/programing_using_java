package constructors;

public class Calculator {
    public int num;

    public int sumOfDigits() {
        int sum = 0;
        String numStr = String.valueOf(num);
        for (char digitChar : numStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }
        return sum;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // Assign a value to the member variable num of Calculator class
        calculator.num = 6547;
        // Invoke the method sumOfDigits of Calculator class and display the output
        int result = calculator.sumOfDigits();
        System.out.println(result);
    }
}
