package test.work2;
//@Author：ranxing
//@Time：2022/10/24   16:30
//@File：ExcelImpl.java

public class ExcelImpl implements Implementor{
    private Excel excel = new Excel();
    @Override
    public void read() {
        excel.readData();
    }
}
