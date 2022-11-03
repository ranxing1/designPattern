package exp10;
//@Author：ranxing
//@Time：2022/11/3   9:55
//@File：EnglishBook.java

public class EnglishBook implements Book{
    @Override
    public void discount() {
        System.out.println("英语类图书打六折");
    }
}
