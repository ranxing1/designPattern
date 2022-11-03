package exp2;
//@Author：ranxing
//@Time：2022/10/6   15:52
//@File：test.java

public class test {
    public static void main(String[] args) {
        Creator hpCreator = new HPCreator();
        Laptop hpLaptop = hpCreator.factoryMethod();
        hpLaptop.show();
        Creator dellCreator = new DellCreator();
        Laptop dellLaptop = dellCreator.factoryMethod();
        dellLaptop.show();
    }
}
