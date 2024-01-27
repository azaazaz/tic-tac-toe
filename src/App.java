public class App {
    public static void main(String[] args) throws Exception {
        Player[] players = new Player[] {
            new Player("O"),
            new Player("X")
        };
        Board board = new Board();

        board.showBoard();
        while (true){
            for (Player player : players) {
                board.refresh(player.ask(), player.getSymbol());
                board.showBoard();

                if (board.victory()) {
                    System.out.println("GAME OVER! Someone won!!!");
                    return;
                }
            }
        }
    }
}
