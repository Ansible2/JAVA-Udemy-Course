public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,55));
        System.out.println(getDurationString(61,0));
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || (seconds < 0 || seconds > 59)){
            return "Invalid Value";
        }

        int hours = 0;
        if (minutes > 59){
            hours = minutes / 60;
            minutes = minutes % 60;
        }
        return String.valueOf(hours) + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid Value";
        }

        int minutes = 0;
        if (seconds > 59){
            minutes = seconds / 60;
            seconds = seconds % 60;
        }

        return getDurationString(minutes,seconds);
    }


}
