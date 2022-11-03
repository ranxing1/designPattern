package exp10;
//@Author：ranxing
//@Time：2022/11/3   9:56
//@File：Client.java

public class Client {
    public static void main(String[] args) {
        Book csBook = new CsBook();
        Book eBook = new EnglishBook();
        Context context = new Context();
        context.setBook(csBook);
        context.contextBook();

        context.setBook(eBook);
        context.contextBook();
    }
}
