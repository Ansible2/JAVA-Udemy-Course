public class LeapYear {
    public static boolean isEvenlyDivided(int numberToCheck,int dividedBy){
        return (numberToCheck % dividedBy) % 2 == 0;
    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }

        return (
                (year % 4 == 0) &&
                (year % 100 != 0) ||
                (year % 400 == 0)
        );
    }
}
