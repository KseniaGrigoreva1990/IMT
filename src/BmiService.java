public class BmiService {
    public static int calculate(int a, double b) {
        double result = a / Math.pow (b, 2);
        return (int) result;
    }
}
