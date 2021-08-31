public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");

        } else {
            // convert to days
            long days = (minutes / 60) / 24;
            long years = 0;
            if (days >= 365){
                // convert to years
                years = (long) Math.floor((double) days / 365);
                days = days % 365;
            }

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }
}
