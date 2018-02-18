public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.exit(0);
        }
        BigString bs = new BigString(args[0], true);
        bs.print();
        printMemoryUsage();

        BigCharFactory.getInstance().clear();
        bs = new BigString(args[0], false);
        printMemoryUsage();
    }
    public static void printMemoryUsage() {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("사용 메모리 = " + used);
    }
}
