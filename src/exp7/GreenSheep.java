package exp7;
//@Author：ranxing
//@Time：2022/10/24   17:21
//@File：GreenSheep.java

public class GreenSheep extends DeSheep{
    public GreenSheep(Sheep sheep) {
        super(sheep);
    }

    @Override
    public String operation() {
        return getSheep().operation()+"\n喜羊羊加速了";
    }
}
