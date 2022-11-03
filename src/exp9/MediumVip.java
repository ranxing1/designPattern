package exp9;
//@Author：ranxing
//@Time：2022/11/3   9:10
//@File：MediumVip.java

public class MediumVip extends Vip{
    private String name;
    private static String observerState;
    public MediumVip(String name){
        this.name = name;
    }
    @Override
    public void update(Subject subject,String name,int price) {
        if((!name.equals(((MediumSubject) subject).getName())) || (price != ((MediumSubject) subject).getPrice())) {

            observerState = ((MediumSubject) subject).getSubjectState();
            if (!name.equals(((MediumSubject) subject).getName())) {
                observerState += " 原名称： " + ((MediumSubject) subject).getName() + " 现名称： " + name;
                ((MediumSubject) subject).setName(name);
            }
            if (price != ((MediumSubject) subject).getPrice()) {
                observerState += " 原价格： " + ((MediumSubject) subject).getPrice() + " 现价格： " + price;
                ((MediumSubject) subject).setPrice(price);
            }

        }
        System.out.println(this.name+" 收到通知: "+observerState);

    }
}
