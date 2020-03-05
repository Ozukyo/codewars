import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.math.BigInteger;

public class CompleteThePattern {
    public static String pattern(int n) {
        List<String> list = new ArrayList<>();
        if (n < 1) {
            return "";
        } else {
            int number = 1;
            for (int i = 0; i < n; i++) {
                list.add(String.valueOf(number));
                number+=1;
            }
            Collections.reverse(list);
            String stringOfNumbers = "";
            for(int j = 0; j < n;j++ ) {
               BigInteger listJoined = new BigInteger(String.join("", list));
                stringOfNumbers +=listJoined + "\n";
                list.remove(list.get(list.size()-1));
            }
            return stringOfNumbers.trim();
        }
    }
}