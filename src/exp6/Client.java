package exp6;
//@Author：ranxing
//@Time：2022/10/24   16:16
//@File：Client.java

public class Client {
    public static void main(String[] args) {
        Implementor milk = new MilkImpl();
        Implementor sugar = new SugarImpl();
        ACoffee jorum = new JorumCoffee(milk);
        ACoffee medium = new MediumCoffee(sugar);
        jorum.make();
        medium.make();
    }
}
