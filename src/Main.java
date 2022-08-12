public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 70;
        double high = 1.75F;
        int result = service.calculate(70, 1.75);

        System.out.println(result + " Ваш ИМТ");
    }
}