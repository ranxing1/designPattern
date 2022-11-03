package exp5;
//@Author：ranxing
//@Time：2022/10/17   20:02
//@File：Adapter.java

public class Adapter implements Draw{
    private Angle angle;

    public Adapter(Angle angle) {
        this.angle = angle;
    }

    @Override
    public void draw() {
        angle.drawAngle();
    }
}
