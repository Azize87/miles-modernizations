public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int divider = 20;
        int miles = ticketPrice / divider;
        return miles;
    }

}
