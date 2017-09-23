package gof.structural.template;

abstract class SportGame {
    abstract void initialize();

    abstract void startGame();

    abstract void endGame();

    final void play() {
        initialize();
        startGame();
        endGame();
        System.out.println();
    }
}
