package tablefactory;
import factory.*;
import java.util.Iterator;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(String.format("<html><head><title>%s</title></head>\n", title));
        buffer.append("<body>");
        buffer.append("<h1>" + title + "</h1>");
        buffer.append("<table width=\"80%\" border=\"3\">");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append("<tr>" + item.makeHTML() + "</tr>");
        }
        buffer.append("</table>");
        buffer.append("<hr><address>" + author + "</address></hr>");
        buffer.append("</body></html>");
        return buffer.toString();
    }
}
