package exp5;
//@Author：ranxing
//@Time：2022/10/17   20:06
//@File：Client.java

public class Client {
    public static Draw draw;
    public static void main(String[] args) {
        Angle angle = new Angle();
        draw = new Adapter(angle);
        draw.draw();
    }
}
