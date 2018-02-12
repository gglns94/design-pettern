public class CharDisplay extends AbstractDisplay {
    private char c;    

    public CharDisplay(char c) {
        this.c = c;
    }    

    protected void open() {
        System.out.print("<<");
    }

    protected void print() {
        System.out.print(c);
    }

    protected void close() {
        System.out.println(">>");
    }
}
