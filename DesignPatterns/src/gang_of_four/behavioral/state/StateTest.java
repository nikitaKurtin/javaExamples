package gang_of_four.behavioral.state;

public class StateTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.togglePlay();

        player.playMusic();
        player.togglePlay();
        player.pauseMusic();
    }
}
