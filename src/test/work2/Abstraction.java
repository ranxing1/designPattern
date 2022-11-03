package test.work2;
//@Author：ranxing
//@Time：2022/10/24   16:28
//@File：Abstraction.java

public abstract class Abstraction {
    protected Implementor implementor;
    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }
    abstract void show();
}
