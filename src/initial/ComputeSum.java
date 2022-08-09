package initial;
public class ComputeSum {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 3;
        Sum sum = new Sum();
        System.out.println("Suma este: "+ sum.sumOfNumbers(4,b,c));
        System.out.println("Suma este: "+ sum.sumOfNumbers(a,b,5));
    }
}