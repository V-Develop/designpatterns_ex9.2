public class Main {
    public static void main(String[] args) {
        Game footballGame = new Game(new Football());
        footballGame.playGame();

        Game basketballGame = new Game(new Basketball());
        basketballGame.playGame();
    }
}