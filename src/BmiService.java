public class BmiService {
    public static int calculate(int a, double b) {
        int result = (int) (a / Math.pow (b, 2));
        return result;
    }
}
