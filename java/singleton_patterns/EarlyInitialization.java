package singleton_patterns;
public class EarlyInitialization {

    private static EarlyInitialization instance = new EarlyInitialization();

    private EarlyInitialization(){};

    public static EarlyInitialization getInstance() {
        return instance;
    }

    public static void main(String... args) {
        EarlyInitialization.getInstance();
    }
}