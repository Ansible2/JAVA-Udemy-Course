public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if (kilobytes < 0){
            System.out.println("Invalid Value");

        } else {
            int conversionRate = 1024;
            int megaBytes = (int)Math.floor((float)kilobytes / conversionRate);
            int remainder = kilobytes % conversionRate;

            System.out.println(kilobytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}
