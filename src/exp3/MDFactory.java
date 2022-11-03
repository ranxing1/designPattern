package exp3;
//@Author：ranxing
//@Time：2022/10/6   15:33
//@File：MDFactory.java

public class MDFactory implements AbstractFactory {
    @Override
    public AbstractHamburg createHamburg() {
        System.out.println("麦当劳有汉堡");
        return new MDHamburg();
    }

    @Override
    public AbstactCola createCola() {
        System.out.println("麦当劳有可乐");
        return new MDCola();
    }
}
