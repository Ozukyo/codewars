import java.util.*;

public class SequenceSum {

    public static void main(String[] args) {
        System.out.println(showSequence(6));
    }

  public static String showSequence(int value){
    int finalValue = 0;
    String stringValue ="";
    List<Integer> list = new ArrayList<>();
    if(value>0) {
      for(int i=0;i<=value;i++) {
        finalValue +=i;
        list.add(i);
      }
      for(int i:list) {
        if (i == list.get(list.size()-1)) {
          stringValue += Integer.toString(i);
        } else {
          stringValue += Integer.toString(i) + "+";
        }
      }
      return stringValue + " = " + finalValue; 
    } else if (value == 0){
      stringValue = "0=0";
      return stringValue;
    } else {
      stringValue = value + "<0";
      return stringValue;
    }

}