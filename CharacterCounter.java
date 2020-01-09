import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CharacterCounter {
    
    public static void main(String[] args) {
        System.out.println(hashMethod());
        
    }
    public static boolean  hashMethod() {
        String str = "abcabc";
        String[] splittedStr = str.split("");

        HashMap <String, Integer> mapOfLetters = new HashMap<String, Integer>();


        for(String letter: splittedStr) {
            Integer counter = mapOfLetters.get(letter);
            
            if (counter == null) {
                mapOfLetters.put(letter, 1);
            } else if (counter != null) {
                mapOfLetters.put(letter, counter+1);
            }
            
        
        }
        Set<Integer> values = new HashSet<Integer>(mapOfLetters.values());
        if(values.size()==1) { //checking if number of values in mapOfLetters equals 1
            return true;
        }else{
            return false;
        }
        
        

    }
}