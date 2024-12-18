public class Calcultor {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public Calcultor(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public int multiply(){
        return firstNumber * secondNumber * thirdNumber;
    }
}
