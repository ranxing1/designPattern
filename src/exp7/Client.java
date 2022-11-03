package exp7;
//@Author：ranxing
//@Time：2022/10/24   17:26
//@File：Client.java

public class Client {
    public static void main(String[] args) {
        Sheep normalSheep = new NormalSheep();
        System.out.println(normalSheep.operation());
        DeSheep redSheep = new RedSheep(normalSheep);
        System.out.println("喜羊羊吃到了红苹果，"+redSheep.operation());
        DeSheep greenSheep = new GreenSheep(redSheep);
        System.out.println("喜羊羊吃到了绿苹果，"+greenSheep.operation());
        DeSheep yellowSheep = new YellowSheep(greenSheep);
        System.out.println("喜羊羊吃到了黄苹果，"+yellowSheep.operation());
    }
}
