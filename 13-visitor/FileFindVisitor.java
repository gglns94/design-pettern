import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class FileFindVisitor extends Visitor { 
    String keyword;
    List<File> foundFiles;
    public FileFindVisitor(String keyword) {
        this.keyword = keyword;
        this.foundFiles = new ArrayList();
    }
    public void visit(File file) {
        if (file.getName().contains(keyword)) {
            this.foundFiles.add(file);      
        }
    }
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }
    public Iterator getFoundFiles() {
        return foundFiles.iterator();
    }
}
