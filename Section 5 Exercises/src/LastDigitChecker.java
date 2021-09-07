import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LastDigitChecker {
    public static boolean hasSameLastDigit (int number_1,int number_2,int number_3){
        List<Integer> numberList = new ArrayList<Integer>(List.of(number_1,number_2,number_3));
        Set<Integer> lastDigitSet = new HashSet<Integer>();

        for (int number : numberList) {
            if (!isValid(number)){
                return false;
            }

            lastDigitSet.add(number % 10);
        }

        return (lastDigitSet.size() < 3);
    }

    public static boolean isValid(int number){
        return (number >= 10 && number <= 1000);
    }
}
