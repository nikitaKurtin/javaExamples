package other.lazy_loading;

/**
 * lazy loading with singleton object
 */
public class LazyLoadingTest {
    public static void main(String[] args) {
        LazyObject.getInstance(); //instance created on first call
        LazyObject.getInstance();
        LazyObject.getInstance();
    }
}
