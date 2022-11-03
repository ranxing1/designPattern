package exp6;
//@Author：ranxing
//@Time：2022/10/24   16:13
//@File：JorumCoffee.java

public class JorumCoffee extends ACoffee{
    public JorumCoffee(Implementor implementor){
        super(implementor);
    }
    @Override
    void make() {
        System.out.print("大杯咖啡");
        implementor.add();
    }
}
