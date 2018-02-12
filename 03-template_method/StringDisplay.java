public class StringDisplay extends AbstractDisplay {

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    protected void open() {
        printLine();
    }

    protected void print() {
        System.out.println("|" + string + "|");
    }

    protected void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for(int i=0; i<string.length(); i++)
            System.out.print("-");
        System.out.println("+");
    }
}
