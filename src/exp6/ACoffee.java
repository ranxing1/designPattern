package exp6;
//@Author：ranxing
//@Time：2022/10/24   16:09
//@File：ACoffee.java

public abstract class ACoffee {
    protected Implementor implementor;
    public ACoffee(Implementor implementor){
        this.implementor = implementor;
    }
    abstract void make();
}
