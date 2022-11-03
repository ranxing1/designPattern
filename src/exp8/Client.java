package exp8;
//@Author：ranxing
//@Time：2022/10/20   8:51
//@File：Client.java

public class Client {
    private static SecuritySystem securitySystem;
    public static void main(String[] args) {
        securitySystem = new SecuritySystem();
        securitySystem.on();
        System.out.println("安保系统启动成功");
        securitySystem.close();
        System.out.println("安保系统已关闭");
    }
}
