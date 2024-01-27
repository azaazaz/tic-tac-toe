import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Player {
    private String symbol;

    public Player (String symbol){
        this.symbol = symbol;
    }

    public String getSymbol(){
        return this.symbol;
    }

    public Integer ask (){
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        Integer coord;
        try {
            System.out.println("Choose a coordinate:");
            coord = Integer.parseInt(reader.readLine());
            return coord;
            
        }
        catch (Exception e) {
            System.out.println("Invalid input. Returning default value.");
            return -1; 
        }
    }
}
