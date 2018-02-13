public class Main {

    public static void main(String[] args) {
        TicketMaker maker = TicketMaker.getInstance();
        System.out.println(String.valueOf(maker.getNextTicketNumber()));
        maker = TicketMaker.getInstance();
        System.out.println(String.valueOf(maker.getNextTicketNumber()));

        Triple t1 = Triple.getInstance(1);
        Triple t1_ = Triple.getInstance(1);
        Triple t2 = Triple.getInstance(2);
        if(t1 == null) {
            System.out.println("triple is null");
        }

        if(t1 == t1_)
            System.out.println("triple t1 and t1_ are same");

        if(t1 != t2)
            System.out.println("triple t1 and t2 are different");
    }
}
