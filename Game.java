class Game {
    private GameStrategy gameStrategy;

    public Game(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void playGame() {
        gameStrategy.initializeGame();
        gameStrategy.playingGame();
        gameStrategy.showResult();
    }
}