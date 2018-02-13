public class TicketMaker {
    
    private static TicketMaker instance = new TicketMaker();
    private int ticket = 1000;

    public static TicketMaker getInstance() {
        return instance;
    }

    private TicketMaker() {}
    public int getNextTicketNumber() {
        return ticket++;
    }
}
