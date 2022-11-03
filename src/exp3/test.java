package exp3;
//@Author：ranxing
//@Time：2022/10/6   15:34
//@File：test.java

public class test{
    public static void main(String[] args) {
        AbstractFactory kfcFactory = new KfcFactory();
        AbstractHamburg kfcHamburg = kfcFactory.createHamburg();
        AbstactCola kfcCola = kfcFactory.createCola();
        kfcHamburg.eat();
        kfcCola.drink();
        System.out.println("---------------------------------");
        AbstractFactory mdFactory = new MDFactory();
        AbstractHamburg mdHamburg = mdFactory.createHamburg();
        AbstactCola mdCola = mdFactory.createCola();
        mdHamburg.eat();
        mdCola.drink();
    }
}
