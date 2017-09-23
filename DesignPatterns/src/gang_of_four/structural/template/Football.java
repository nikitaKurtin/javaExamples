package gang_of_four.structural.template;

class Football extends SportGame {
    @Override
    void initialize() {
        System.out.println("starting football game, there are two teams");
    }

    @Override
    void startGame() {
        System.out.println("game started");
    }

    @Override
    void endGame() {
        System.out.println("Game over, team won");
    }
}
