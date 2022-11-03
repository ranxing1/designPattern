package exp3;
//@Author：ranxing
//@Time：2022/10/6   15:30
//@File：KfcFactory.java

public class KfcFactory implements AbstractFactory {
    @Override
    public AbstractHamburg createHamburg() {
        System.out.println("KFC有汉堡");
        return new KfcHamburg();
    }

    @Override
    public AbstactCola createCola() {
        System.out.println("KFC有可乐");
        return new KfcCola();
    }
}
