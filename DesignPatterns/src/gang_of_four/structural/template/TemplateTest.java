package gang_of_four.structural.template;

public class TemplateTest {
    public static void main(String[] args) {
        SportGame game = new Chess();
        game.play();

        game = new Football();
        game.play();
    }
}
