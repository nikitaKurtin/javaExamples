package gang_of_four.structural.flyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        String[] paths = {"Gal", "Lera", "Nikita", "Gal", "Marina", "Lera", "Gal"};

        for (String path : paths) {
            Image currentImg = Image.fetchImage(path);
            currentImg.showImage();
        }
    }
}
