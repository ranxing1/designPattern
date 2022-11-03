package exp1;
//@Author：ranxing
//@Time：2022/10/10   18:57
//@File：AppConfig.java

public class AppConfig {
    private String parameterA;
    private static AppConfig appConfig = new AppConfig();

    private void setParameterA(String parameterA) {
        this.parameterA = parameterA;
    }

    public String getParameterA() {
        return parameterA;
    }

    public static AppConfig getInstance(String parameterA){
        appConfig.setParameterA(parameterA);
        System.out.println("导入" + parameterA);
        return appConfig;
    }
}
