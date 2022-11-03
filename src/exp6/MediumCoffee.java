package exp6;
//@Author：ranxing
//@Time：2022/10/24   16:14
//@File：MediumCoffee.java

public class MediumCoffee extends ACoffee{
    public MediumCoffee(Implementor implementor){
        super(implementor);
    }
    @Override
    void make() {
        System.out.print("中杯咖啡");
        implementor.add();
    }
}
