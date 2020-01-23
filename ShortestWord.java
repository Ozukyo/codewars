public class ShortestWord {
    
    
    public static int findShort(String s) {
        String[] splittedString = s.split(" ");
        int shortestWord = splittedString[0].length();
        for(int i=0;i<splittedString.length;i++) {
            if(splittedString[i].length()<shortestWord) {
                shortestWord = splittedString[i].length();
            }
        }
        return shortestWord;
    }


    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
}