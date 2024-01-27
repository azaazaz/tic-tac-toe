import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<String> myList = new ArrayList<>();

    public Board(){
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        myList.add("6");
        myList.add("7");
        myList.add("8");
        myList.add("9");
    }



    void showBoard(){
        System.out.print("-+-+-+--\n");
        for (int i = 0; i < 3; i++) {
            System.out.print(myList.get(i));
            System.out.print("|");
        }
        System.out.print("\n-+-+-+--\n");
        for (int i = 3; i < 6; i++) {
            System.out.print(myList.get(i));
            System.out.print("|");
        }
        System.out.print("\n-+-+-+--\n");
        for (int i = 6; i < 9; i++) {
            System.out.print(myList.get(i));
            System.out.print("|");
        }
        System.out.print("\n-+-+-+--\n");
    }


    void refresh(int coordinate, String player){
        if (possible(coordinate-1)){
            myList.set(coordinate-1, player);
        }
    }

    private boolean possible (int coordinate){
        if (coordinate > 9 || coordinate < 0){
            return false;
        }
        if (myList.get(coordinate) == "O" || myList.get(coordinate) == "X"){
            System.out.println("not a possible move, you lose your turn");
            return false;
        }
        return true;
    }



    boolean victory(){
        if (myList.get(0) == myList.get(1) && myList.get(1) == myList.get(2)){
            return true;
        }
        if (myList.get(3) == myList.get(4) && myList.get(4) == myList.get(5)){
            return true;
        }
        if (myList.get(6) == myList.get(7) && myList.get(7) == myList.get(8)){
            return true;
        }
        if (myList.get(0) == myList.get(3) && myList.get(3) == myList.get(6)){
            return true;
        }
        if (myList.get(1) == myList.get(4) && myList.get(4) == myList.get(7)){
            return true;
        }
        if (myList.get(2) == myList.get(5) && myList.get(5) == myList.get(8)){
            return true;
        }
        if (myList.get(0) == myList.get(4) && myList.get(4) == myList.get(8)){
            return true;
        }
        if (myList.get(2) == myList.get(4) && myList.get(4) == myList.get(6)){
            return true;
        }
        return false;
        
    }
}
