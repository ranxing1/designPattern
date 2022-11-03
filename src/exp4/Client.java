package exp4;
//@Author：ranxing
//@Time：2022/10/13   9:00
//@File：Client.java

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        AbstractCarBuilder bmwBuilder = new BMWCarBuilder();
        director.setcarBuilder(bmwBuilder);
        Car bmw = director.getCar();
        System.out.println(bmw.getWheel());
        System.out.println(bmw.getOilBox());
        System.out.println(bmw.getBody());
    }
}
