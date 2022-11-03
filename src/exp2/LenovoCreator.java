package exp2;
//@Author：ranxing
//@Time：2022/10/6   15:48
//@File：LenovoCreator.java

public class LenovoCreator implements Creator {
    @Override
    public Laptop factoryMethod() {
        System.out.println("联想厂商有联想笔记本");
        return new LenovoLaptop();
    }
}
