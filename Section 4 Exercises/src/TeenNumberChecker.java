import java.util.Arrays;
import java.util.List;

public class TeenNumberChecker {
    public static boolean hasTeen(int number_1, int number_2, int number_3){
        List<Integer> listOfNumbers = List.of(number_1, number_2, number_3);
        for (int number : listOfNumbers) {
            if (isTeen(number)){
                return true;
            }
        }

        return false;
    }

    public static boolean isTeen(int number){
        return (number >= 13 && number <= 19);
    }
}
