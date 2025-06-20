package Anu;










public class AppConfig {
    private static AppConfig config;

    private AppConfig() {
    }

    public static AppConfig create() {
        if (config == null) {
            config = new AppConfig();
        }
        return config;
    }

    public void printStatus() {
        System.out.println("Cognizant exercise 1 on Singleton");
    }

    public static void main(String[] args) {
        AppConfig a = AppConfig.create();
        AppConfig b = AppConfig.create();

        a.printStatus();
        System.out.println(a == b);
    }
}





