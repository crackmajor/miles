public class Main {
    public static void main(String[] args) {
        int cost = 100_000; // стоимость билета(руб.)
        int bonus = 20; // рубли для одной бонусной мили
        int miles = cost / bonus; // бонусные мили
        System.out.println((miles) + " бонусных миль");

    }
}
