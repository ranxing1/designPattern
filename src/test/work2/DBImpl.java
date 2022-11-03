package test.work2;
//@Author：ranxing
//@Time：2022/10/24   16:30
//@File：DBImpl.java

public class DBImpl implements Implementor{
    @Override
    public void read() {
        System.out.println("从数据库读取");
    }
}
