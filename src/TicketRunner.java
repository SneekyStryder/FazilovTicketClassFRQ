public class TicketRunner {
    public static void main(String[] args) {
        Walkup w = new Walkup(50);
        System.out.println(w);
        System.out.println("---");
        Advance a1 = new Advance(10);
        System.out.println(a1);
        System.out.println("---");
        Advance a2 = new Advance(4);
        System.out.println(a2);
        System.out.println("---");
        Advance sa1 = new StudentAdvance(10);
        System.out.println(sa1);
        System.out.println("---");
        Advance sa2 = new StudentAdvance(4);
        System.out.println(sa2);
        System.out.println("---");

    }
}
