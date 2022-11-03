package exp6;
//@Author：ranxing
//@Time：2022/10/24   16:15
//@File：SmallCoffee.java

public class SmallCoffee extends ACoffee{
    public SmallCoffee(Implementor implementor){
        super(implementor);
    }
    @Override
    void make() {
        System.out.print("小杯咖啡");
        implementor.add();
    }
}
