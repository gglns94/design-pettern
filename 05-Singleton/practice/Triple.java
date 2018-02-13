public class Triple {
    
    private static Triple[] triples = new Triple[] {
        new Triple(),
        new Triple(),
        new Triple()  
    };

    public static Triple getInstance(int i) {
        return triples[i];
    }

    private Triple() {}
}
