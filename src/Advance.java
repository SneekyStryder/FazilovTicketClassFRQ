public class Advance extends Ticket {
    private int daysInAdvance;

    public Advance(int numDays) {
        super();
        daysInAdvance = numDays;
    }

    @Override
    public int getPrice() {
        if (daysInAdvance >= 10) {
            return 30;
        }
        else {
            return 40;
        }
    }

    @Override
    public String toString() {
        return "Advance\n" + super.toString();
    }
}
