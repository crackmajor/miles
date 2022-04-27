public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20; // рубли для одной бонусной мили
        int miles = price / bonus; // бонусные мили
        return miles;
    }
}
