package exp7;
//@Author：ranxing
//@Time：2022/10/24   17:21
//@File：RedSheep.java

public class RedSheep extends DeSheep{
    public RedSheep(Sheep sheep) {
        super(sheep);
    }

    @Override
    public String operation() {
        return getSheep().operation()+"喜羊羊有了保护罩";
    }
}
