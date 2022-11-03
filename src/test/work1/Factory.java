package test.work1;
//@Author：ranxing
//@Time：2022/10/23   12:33
//@File：Factory.java

public class Factory {
    public Shape getShapeInstance(int type){
        switch (type){
            case 0:return new Point();
            case 1:return new Rectangle();
            case 2:return new Line();
            case 3:return new Circle();
            default:return null;
        }
    }
}
