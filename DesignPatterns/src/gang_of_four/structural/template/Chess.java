package gang_of_four.structural.template;

class Chess extends SportGame {
    @Override
    void initialize() {
        System.out.println("tools are ready, players sitting");
    }

    @Override
    void startGame() {
        System.out.println("game started, white moved");
    }

    @Override
    void endGame() {
        System.out.println("Check-mate");
    }
}
