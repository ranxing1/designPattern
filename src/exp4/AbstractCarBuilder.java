package exp4;
//@Author：ranxing
//@Time：2022/10/13   8:58
//@File：AbstractCarBuilder.java

abstract public class AbstractCarBuilder {
    protected Car car = new Car();

    public Car getCar() {
        return car;
    }
    public abstract void buildWheel();
    public abstract void buildOilBox();
    public abstract void buildBody();

}
