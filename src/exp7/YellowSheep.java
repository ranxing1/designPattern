package exp7;
//@Author：ranxing
//@Time：2022/10/24   17:22
//@File：YellowSheep.java

public class YellowSheep extends DeSheep{
    public YellowSheep(Sheep sheep) {
        super(sheep);
    }

    @Override
    public String operation() {
        return getSheep().operation()+"\n喜羊羊可以淌水了";
    }
}
