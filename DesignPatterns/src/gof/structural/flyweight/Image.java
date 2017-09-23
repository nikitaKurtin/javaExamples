package gof.structural.flyweight;

import java.util.HashMap;

class Image {
    private String path;

    private Image(String path) {
        try {
            System.out.println("\nLoading image from server..");
            Thread.sleep(1000);
            this.path = path;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void showImage() {
        System.out.println("Showing image in path: " + path);
    }

    private static final HashMap<String, Image> CACHE = new HashMap<>();

    //Factory method with flyweight
    static Image fetchImage(String path) {
        Image img;
        if (CACHE.containsKey(path)) {
            img = CACHE.get(path);
        } else {
            img = new Image(path);
            CACHE.put(path, img);
        }
        return img;
    }
}
