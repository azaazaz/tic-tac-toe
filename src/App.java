public class App {
    public static void main(String[] args) throws Exception {        

        Player PlayerO = new Player();
        Player PlayerX = new Player();
        Board board = new Board();
        Integer coord;
        board.showBoard();

        
        while (true){
            System.out.println("O's Turn");
            coord = PlayerO.ask();
            board.refresh(coord,"O");
            board.showBoard();
            if (board.victory()){
                System.out.println("GAME OVER! Player O won!!!");
                break;
            }
            

            System.out.println("X's Turn");
            coord = PlayerX.ask();
            board.refresh(coord,"X");
            board.showBoard();
            if (board.victory()){
                System.out.println("GAME OVER! Player X won!!!");
                break;
            }
        }
    }
}
