import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList<Element> implements Element {
    public void accept(Visitor v) {
        Iterator it = iterator();
        while (it.hasNext()) {
            Element e = (Element) it.next();
            e.accept(v);
        }  
    }
}
