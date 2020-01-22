import java.util.ArrayList;
import java.util.List;

public class SquareDigit {

    public static void main(String[] args) {
      System.out.println(squareDigits(3));
    }


    public static int squareDigits(int n) {
      List<Integer> listOfDigits = new ArrayList<>();
      int lengthOfNumber = String.valueOf(n).length();
      String result = "";
      for(int i=0;i<lengthOfNumber;i++) {
        int digit = n%10;
        listOfDigits.add(digit*digit);
        n=n/10;
      }
      for(int digit: listOfDigits) {
        result=digit+result;
      }
      return Integer.valueOf(result);
    }
  
  }