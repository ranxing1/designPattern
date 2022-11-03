package exp2;
//@Author：ranxing
//@Time：2022/10/6   15:50
//@File：DellCreator.java

public class DellCreator implements Creator {
    @Override
    public Laptop factoryMethod() {
        System.out.println("戴尔厂商有戴尔笔记本");
        return new DellLaptop();
    }
}
