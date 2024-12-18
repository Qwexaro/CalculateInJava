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

    public static Calcultor calculate(int num1, int num2, int num3) {
        Calcultor calculateIvanov = new Calcultor(num1, num2, num3);
        System.out.println("Hash code is inside object: " + calculateIvanov.hashCode());
        return calculateIvanov;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Override
    public String toString() {
        return "Calcultor{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", thirdNumber=" + thirdNumber +
                '}';
    }
}
