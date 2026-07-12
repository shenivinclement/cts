public class ConfigManager {

    private static volatile ConfigManager instance;

    private ConfigManager() {
        System.out.println("ConfigManager created!");
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            synchronized (ConfigManager.class) {
                if (instance == null) {
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }
}