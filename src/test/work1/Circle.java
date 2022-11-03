package test.work1;
//@Author：ranxing
//@Time：2022/10/23   12:30
//@File：Circle.java

public class Circle implements Shape{
    private XCircle pxc;
    public Circle(){
        pxc = new XCircle();
    }
    @Override
    public void disPlay() {
        pxc.display();
    }
}
