import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  */
	public int sum(List<?> mixed) {	
		int sumOfNumbers = 0;
     for(Object element: mixed) {
      if(element.getClass().getSimpleName().equals("String")) {
        int stringToInt = Integer.parseInt(element.toString());
        sumOfNumbers +=stringToInt; 
      } else {
        sumOfNumbers +=Integer.parseInt(element.toString());
      } 
    }
    return sumOfNumbers;
      
	}
}