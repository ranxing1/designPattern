package test.work1;
//@Author：ranxing
//@Time：2022/10/23   12:35
//@File：App.java

public class App {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("error parameters");
            return;
        }
        int type = (new Integer(args[0])).intValue();
         Factory factory= new Factory();
        Shape s = factory.getShapeInstance(type);
        if(s == null){
            System.out.println("error instance!");
            return;
        }
        s.disPlay();
    }
}
