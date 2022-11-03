package exp9;
//@Author：ranxing
//@Time：2022/10/31   17:15
//@File：Subject.java


import java.util.ArrayList;
import java.util.List;

abstract public class Subject {
    private List<Vip> vips = new ArrayList<>();
    public List<Vip> getVips(){
        return vips;
    }

    public void setVips(List<Vip> vips) {
        this.vips = vips;
    }

    public void notifyToAll(String name,int price){
        for(Vip vip : vips){
            vip.update(this,name,price);
        }
    }

    public abstract void attach(Vip vip);
    public abstract void detach(Vip vip);
}
