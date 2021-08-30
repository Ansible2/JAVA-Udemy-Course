public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        double kphToMph = 1.609;
        if (kilometersPerHour < 0){
            return -1;
        }

        double mph = kilometersPerHour / kphToMph;
        return Math.round(mph);
    }

    public static void printConversion(double kilometersPerHour){
        long mph = toMilesPerHour(kilometersPerHour);

        if (mph < 0){
            System.out.println("Invalid Value");

        } else {
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");

        }
    }
}
