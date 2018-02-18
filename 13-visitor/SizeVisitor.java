import java.util.Iterator;

public class SizeVisitor extends Visitor {
    int size = 0;
    public void visit(File file) {
        size += file.getSize();
    } 
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }
    public int getSize() {
        return size;
    }
}
