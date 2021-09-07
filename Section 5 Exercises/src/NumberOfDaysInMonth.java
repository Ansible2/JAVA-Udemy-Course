public class NumberOfDaysInMonth {
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

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }

        int numberOfDays = 0;
        if (
            month == 1 ||
            month == 3 ||
            month == 5 ||
            month == 7 ||
            month == 8 ||
            month == 10 ||
            month == 12
        ){
            numberOfDays = 31;
        } else if (month == 2){
            if (isLeapYear(year)){
                numberOfDays = 29;
            } else {
                numberOfDays = 28;
            }

        } else {
            numberOfDays = 30;
        }

        return numberOfDays;
    }

}
