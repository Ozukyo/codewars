import java.util.HashMap;
import java.util.Map;

public class AlphabeticalAddition {
    public static void main(String[] args) {
        System.out.println(addLetters("c", "d", "y","z", "s", "b") ); 
    }

    public static String addLetters(String... letters) {
        Map<String, Integer> mapOfLetters = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] splittedAlphabet = alphabet.split(""); 
        int i = 0;
        
        for(String letter:splittedAlphabet) {
            i+=1;
            mapOfLetters.put(letter, i);    

        }
        if(letters.length<1) {
            return "z";
        }
        
        
        int counter = 0;
        for(String letter:letters) {
            if(mapOfLetters.containsKey(letter)) {
                counter +=mapOfLetters.get(letter);
            }
        }
        while(counter>26) {
            counter-=26;
           }

        Map<Integer, String> reversedMapOfLetters = new HashMap<>();  
        for(Map.Entry<String, Integer> entry : mapOfLetters.entrySet()){
            reversedMapOfLetters.put(entry.getValue(), entry.getKey());  //reversing previous hashmap
        
        }
        return reversedMapOfLetters.get(counter); //expected output "a"


    }
}