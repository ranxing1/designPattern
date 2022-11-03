package exp2;
//@Author：ranxing
//@Time：2022/10/6   15:51
//@File：HPCreator.java

public class HPCreator implements Creator {
    @Override
    public Laptop factoryMethod() {
        System.out.println("惠普厂商有惠普笔记本");
        return new HPLaptop();
    }
}
