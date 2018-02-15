public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        System.out.println(textBuilder.getResult());

        HTMLBuilder htmlBuilder = new HTMLBuilder();
        director = new Director(htmlBuilder);
        director.construct();
        String filename = htmlBuilder.getResult();
        System.out.println(filename + "가 작성되었습니다.");
    }
}
