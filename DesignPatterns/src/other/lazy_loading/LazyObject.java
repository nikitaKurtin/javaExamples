package other.lazy_loading;

/**
 * Singleton object, with lazy loading
 */
class LazyObject {
    private static LazyObject instance;

    private LazyObject() {
    }

    /**
     * not thread safe,
     * for thread safety you may use 'double lock checking' or enum
     */
    public static LazyObject getInstance() {
        if (instance == null) {
            instance = new LazyObject();
            System.out.println("instance created");
        }
        System.out.println("instance returned");
        return instance;
    }
}
