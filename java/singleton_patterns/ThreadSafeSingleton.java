package singleton_patterns;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            return new ThreadSafeSingleton();
        }

        return instance;
    }

    public static ThreadSafeSingleton getDoubleCheckedLockingInstance() {
        if (instance == null) {
            synchronized(ThreadSafeSingleton.class) {
                return new ThreadSafeSingleton();
            }
        }

        return instance;
    }
}
