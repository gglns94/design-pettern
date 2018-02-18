import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            // rootdir.printList();
            rootdir.accept(new ListVisitor());

            Directory kim = new Directory("Kim");
            Directory lee = new Directory("Lee");
            Directory park = new Directory("Park");

            usrdir.add(kim);
            usrdir.add(lee);
            usrdir.add(park);

            kim.add(new File("diary.html", 100));
            kim.add(new File("composite.java", 200));
            lee.add(new File("memo.txt", 300));
            lee.add(new File("index.html", 350));
            park.add(new File("game.doc", 400));
            park.add(new File("junk.mail", 500)); 

            FileFindVisitor ffv = new FileFindVisitor(".html");
            rootdir.accept(ffv);
            Iterator it = ffv.getFoundFiles();
            while (it.hasNext()) {
                File file = (File) it.next();
                System.out.println(file);
            }

            ElementArrayList list = new ElementArrayList();
            list.add(rootdir);
            list.add(new File("etc.html", 1000));
            list.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
