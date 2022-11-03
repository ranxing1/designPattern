package exp10;
//@Author：ranxing
//@Time：2022/11/3   9:55
//@File：CsBook.java

public class CsBook implements Book{
    @Override
    public void discount() {
        System.out.println("计算机类图书打七折");
    }
}
