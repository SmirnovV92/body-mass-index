public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(100.00, 183.00);
        System.out.println("Индекс Массы Тела = " + bmi);
    }
}