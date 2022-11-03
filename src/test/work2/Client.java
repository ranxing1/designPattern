package test.work2;
//@Author：ranxing
//@Time：2022/10/24   16:34
//@File：Client.java

public class Client {
    public static void main(String[] args) {
        Implementor txtImpl = new TxtImpl();
        Implementor dbTmpl = new DBImpl();
        Implementor excelImpl = new ExcelImpl();
        Abstraction x1 = new RefinedAbstraction(txtImpl);
        Abstraction x2 = new RefinedAbstraction(dbTmpl);
        Abstraction x3 = new RefinedAbstraction(excelImpl);
        x1.show();
        x2.show();
        x3.show();
    }
}
