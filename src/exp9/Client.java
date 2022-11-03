package exp9;
//@Author：ranxing
//@Time：2022/11/3   9:18
//@File：Client.java

public class Client {
    public static void main(String[] args) {
        Subject milkSubject = new PrimarySubject("牛奶",20);
        PrimaryVip primaryVip1 = new PrimaryVip("张三");
        PrimaryVip primaryVip2 = new PrimaryVip("李四");
        PrimaryVip primaryVip3 = new PrimaryVip("王五");
        milkSubject.attach(primaryVip1);
        milkSubject.attach(primaryVip2);
        milkSubject.attach(primaryVip3);

        ((PrimarySubject)milkSubject).setSubjectState("初级商品牛奶改名了");
        milkSubject.notifyToAll("纯牛奶", ((PrimarySubject) milkSubject).getPrice());

        System.out.println("-----------------------------------");

        Subject appleSubject = new MediumSubject("苹果",10);
        MediumVip mediumVip1 = new MediumVip("张三");
        MediumVip mediumVip2 = new MediumVip("赵六");
        appleSubject.attach(mediumVip1);
        appleSubject.attach(mediumVip2);

        ((MediumSubject)appleSubject).setSubjectState("中级级商品苹果降价了");
        appleSubject.notifyToAll(((MediumSubject) appleSubject).getName(), 9);

    }
}
