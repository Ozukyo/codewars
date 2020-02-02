import java.util.Arrays;

public class CountSheep {

    public static void main(String[] args) {
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));

    }

    public static String warnTheSheep(String[] array) {
        int index = 0;
        if(Arrays.asList(array).contains("wolf"))   {
            return "Pls go away and stop eating my sheep";
        }

        for(int i = 0; i < array.length/2;i++) {
            String temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i - 1] = temp;

        }
        for(int i = 0; i<array.length;i++) {
            if (array[i].equals("wolf")) {
                index += i;
            }
        }

        return "Oi! Sheep number " + index + "! " + "You are about to be eaten by a wolf!";

    }

}