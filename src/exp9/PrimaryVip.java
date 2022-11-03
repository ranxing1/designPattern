package exp9;
//@Author：ranxing
//@Time：2022/10/31   17:36
//@File：Primary.java

public class PrimaryVip extends Vip{
    private String name;
    private static String observerState;
    public PrimaryVip(String name){
        this.name = name;
    }
    @Override
    public void update(Subject subject,String name,int price) {
        if((!name.equals(((PrimarySubject) subject).getName())) || (price != ((PrimarySubject) subject).getPrice())) {

            observerState = ((PrimarySubject) subject).getSubjectState();
            if (!name.equals(((PrimarySubject) subject).getName())) {
                observerState += " 原名称： " + ((PrimarySubject) subject).getName() + " 现名称： " + name;
                ((PrimarySubject) subject).setName(name);
            }
            if (price != ((PrimarySubject) subject).getPrice()) {
                observerState += " 原价格： " + ((PrimarySubject) subject).getPrice() + " 现价格： " + price;
                ((PrimarySubject) subject).setPrice(price);
            }

        }
        System.out.println(this.name+" 收到通知: "+observerState);
    }
}
