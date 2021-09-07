import java.util.*;

public class SharedDigit {
    public static boolean hasSharedDigit(int number_1,int number_2){
        if ((number_1 < 10 || number_1 > 99) || (number_2 < 10 || number_2 > 99)){
            return false;
        }

        Set<Integer> number_1_digits = new HashSet<Integer>();
        while (number_1 > 0){
            int digit = number_1 % 10;
            number_1_digits.add(digit);
            number_1 /= 10;
        }


        while (number_2 > 0){
            int digit = number_2 % 10;
            if (number_1_digits.contains(digit)){
                return true;
            }
            number_2 /= 10;
        }

        return false;
    }
}
