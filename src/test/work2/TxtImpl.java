package test.work2;
//@Author：ranxing
//@Time：2022/10/24   16:29
//@File：TxtImpl.java

public class TxtImpl implements Implementor{
    @Override
    public void read() {
        System.out.println("从文本文件读取");
    }
}
