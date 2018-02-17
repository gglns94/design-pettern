import factory.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
     
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);
        Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
        Link chosun = factory.createLink("조선일보", "http://www.chosun.com/");

        Tray traynews = factory.createTray("신문");
        traynews.add(joins);
        traynews.add(chosun);

        Page page = factory.createPage("LinkPage", "영진닷컴");
        page.add(traynews);
        page.output();
    }
}
