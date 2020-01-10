public class InParts {
    public static void main(String[] args) {
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 3));

    }


    public static String splitInParts(String s, int partLenght) { 
        String stringOfLetters= "";
        int index = 0;


        while(index<s.length()) {
            stringOfLetters += " " + (s.substring(index, Math.min(index + partLenght, s.length())));
            index += partLenght;
        }
        return stringOfLetters.trim();
        
        
    }
   
}