package exp2;
//@Author：ranxing
//@Time：2022/10/6   15:49
//@File：AcerCreator.java

public class AcerCreator implements Creator {
    @Override
    public Laptop factoryMethod() {
        System.out.println("宏基厂商有宏基笔记本");
        return new AcerLaptop();
    }
}
