public class BonusMilesService {
    public int calculate(int cost) {
        int costOfOneMile = 20; // Количество рублей для расчёта одной бонусной мили
        int bonusMiles = cost / costOfOneMile;
        return bonusMiles;
    }
}
