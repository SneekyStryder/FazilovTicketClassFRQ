public class StudentAdvance extends Advance {
    public StudentAdvance(int numDays) {
        super(numDays);
    }

    @Override
    public int getPrice() {
        return super.getPrice() / 2;
    }

    @Override
    public String toString() {
        return "StudentAdvance\nNumber: " + getSerialNumber() + "\nPrice: " + getPrice() + "\n(student ID required)";
    }
}
