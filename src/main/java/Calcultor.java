public class Calcultor {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public Calcultor(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public int multiply() {
        return firstNumber * secondNumber * thirdNumber;
    }

    public static int calculate(int num1, int num2, int num3) {
        Calcultor calcultor = new Calcultor(num1, num2, num3);
        return calcultor.multiply();
    }
}
