package exp4;
//@Author：ranxing
//@Time：2022/10/13   8:58
//@File：BenZCarBuilder.java

public class BenZCarBuilder extends AbstractCarBuilder{
    @Override
    public void buildWheel() {
        car.setWheel("BenZ轮胎");
    }

    @Override
    public void buildOilBox() {
        car.setOilBox("BenZ油箱");

    }

    @Override
    public void buildBody() {
        car.setBody("BenZ车身");

    }
}
