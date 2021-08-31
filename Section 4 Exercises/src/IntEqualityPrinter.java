import java.util.List;
import java.util.HashSet;

public class IntEqualityPrinter {
    public static void printEqual(int number_1, int number_2, int number_3){

        HashSet<Integer> hashSetOfNumbers = new HashSet<Integer>();
        List<Integer> listOfNumbers = List.of(number_1, number_2, number_3);

        boolean numbersAreDifferent = false;
        for (int number : listOfNumbers){
            if (number < 0){
                System.out.println("Invalid Value");
                return;
            }
            hashSetOfNumbers.add(number);
        }

        int setSize = hashSetOfNumbers.size();
        if (setSize == 1) {
            System.out.println("All numbers are equal");

        } else if (setSize == 2){
            System.out.println("Neither all are equal or different");

        } else {
            System.out.println("All numbers are different");

        }

    }
}
