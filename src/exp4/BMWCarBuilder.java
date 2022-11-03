package exp4;
//@Author：ranxing
//@Time：2022/10/13   8:58
//@File：BMWCarBuilder.java

public class BMWCarBuilder extends AbstractCarBuilder{
    @Override
    public void buildWheel() {
        car.setWheel("BMW轮胎");
    }

    @Override
    public void buildOilBox() {
        car.setOilBox("BMW油箱");
    }

    @Override
    public void buildBody() {
        car.setBody("BMW车身");
    }
}
