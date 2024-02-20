package singleton_patterns;

public class StaticBlockInitialization {

    private static StaticBlockInitialization instance;

    private StaticBlockInitialization() {}

    static {
        try {
            instance = new StaticBlockInitialization();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {}
    }

    public static StaticBlockInitialization getInstance() {
        return instance;
    }
}
