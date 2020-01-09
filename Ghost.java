import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ghost {
    List<String> colors = Arrays.asList("white", "yellow", "purple", "red");
    public static void main(String[] args) {
       Ghost ghost = new Ghost();

       String printGhostF = ghost.getColor(); // for testing
       String printGhostS = ghost.getColor();
       System.out.println(printGhostF);
       System.out.println(printGhostS); 
        
    } 

    public String getColor() {
        Random randomColor = new Random();
        String color = colors.get(randomColor.nextInt(colors.size()));

        return color;
    }

}
