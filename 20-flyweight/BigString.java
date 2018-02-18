public class BigString {
    private boolean shared;
    private BigChar[] bigchars;
    public BigString(String string, boolean shared) {
        this.shared = shared;
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchars.length; i ++) {
            char ch = string.charAt(i);
            bigchars[i] = shared ? factory.getBigChar(ch) : new BigChar(ch);
        }
    }
    public void print() {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}
