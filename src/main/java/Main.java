public class Main {
    public static void main(String[] args) {
/*        Calcultor firstCalculator = Calcultor.calculate(6, 3, 1);
        System.out.println("External object hash code: " + firstCalculator.hashCode());*/
        Calcultor number = Calcultor.calculate(6, 3, 1);
        updateNumber(number);
        System.out.println(number);
    }

    public static void updateNumber(Calcultor currentNumber) {
        currentNumber.setFirstNumber(85);
    }

    // new oblast' pamyati not creating
}
