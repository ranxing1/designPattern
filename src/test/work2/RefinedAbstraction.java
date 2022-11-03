package test.work2;
//@Author：ranxing
//@Time：2022/10/24   16:33
//@File：RefinedAbstraction.java

public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor implementor){
        super(implementor);
    }
    @Override
    void show() {
        implementor.read();
    }
}
