
public class InPartsOtherSolution {
    public static void main (String[] args) {
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 3));
    }



    public static String splitInParts(String s, int partLength) {

        StringBuilder stringOfLetters = new StringBuilder(s);

        int index  = partLength;
        
        while(index< stringOfLetters.length()) {
            stringOfLetters.insert(index, " ");
            index += partLength +1 ;
        }
            return stringOfLetters.toString();


    }
}