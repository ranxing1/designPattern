package exp8;
//@Author：ranxing
//@Time：2022/10/20   8:42
//@File：SecuritySystem.java

public class SecuritySystem {
    private Alarm alarm;
    private Camera camera;
    private Light light;
    private Sensor sensor;
    public SecuritySystem(){
        alarm = new Alarm();
        camera = new Camera();
        light = new Light();
        sensor = new Sensor();
    }
    public void on(){
        try {
            alarm.on();
            camera.on();
            light.on();
            sensor.on();
        }
        catch (Exception e){
            System.out.println("启动失败");
        }
    }
    public void close(){
        try {
            alarm.close();
            camera.close();
            light.close();
            sensor.close();
        }
        catch (Exception e){
            System.out.println("关闭失败");
        }
    }
}
