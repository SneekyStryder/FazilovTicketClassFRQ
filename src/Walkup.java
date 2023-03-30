public class Walkup extends Ticket {
    private int price;

    public Walkup(int price) {
        super();
        this.price = price;
    }

    @Override
    public String toString() {
        return "Walkup\n" + super.toString();
    }
}
