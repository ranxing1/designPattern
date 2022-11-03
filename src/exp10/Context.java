package exp10;
//@Author：ranxing
//@Time：2022/11/3   9:56
//@File：Context.java

public class Context {
    private Book book;

    public void setBook(Book book) {
        this.book = book;
    }

    public void contextBook(){
        book.discount();
    }
}
