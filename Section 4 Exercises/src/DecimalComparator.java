import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number_1,double number_2){
        BigDecimal number_1_bd = BigDecimal.valueOf(number_1);
        number_1_bd = number_1_bd.setScale(3,RoundingMode.DOWN);
        //System.out.println(number_1_bd);

        BigDecimal number_2_bd = BigDecimal.valueOf(number_2);
        number_2_bd = number_2_bd.setScale(3,RoundingMode.DOWN);
        //System.out.println(number_2_bd);

        return (number_1_bd.equals(number_2_bd));
    }
}
