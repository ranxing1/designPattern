package exp7;
//@Author：ranxing
//@Time：2022/10/24   17:23
//@File：DeSheep.java

abstract public class DeSheep extends Sheep{
    private Sheep sheep;
    public DeSheep(Sheep sheep){
        this.sheep = sheep;
    }
    public Sheep getSheep(){
        return sheep;
    }
}
