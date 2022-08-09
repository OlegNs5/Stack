package refactor;

public class ComputeSum {

    public static void main(String[] args) {
        Sum sumInMain = new Sum();
        sumInMain.setA(5);
        sumInMain.setB(3);
        Adder adder = new Adder();
        System.out.println("suma este: " + adder.sumOfNumbers(sumInMain));
    }
}
