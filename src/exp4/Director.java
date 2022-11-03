package exp4;
//@Author：ranxing
//@Time：2022/10/13   9:00
//@File：Director.java

public class Director {
    private AbstractCarBuilder carBuilder;

    public void setcarBuilder(AbstractCarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    public Car getCar(){
        carBuilder.buildWheel();
        carBuilder.buildOilBox();
        carBuilder.buildBody();
        return carBuilder.getCar();
    }
}
