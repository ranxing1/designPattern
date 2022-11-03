package exp9;
//@Author：ranxing
//@Time：2022/10/31   17:24
//@File：MilkSubject.java

public class PrimarySubject extends Subject{
    private String name;
    private int price;
    private String subjectState;

    public PrimarySubject(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getSubjectState(){
        return subjectState;
    }

    public void setSubjectState(String subjectState){
        this.subjectState = subjectState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void attach(Vip vip) {
        getVips().add(vip);
    }

    @Override
    public void detach(Vip vip) {
        getVips().remove(vip);
    }
}
