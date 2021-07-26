public class Main {

    public static void main(String[] args) {
        String printString = "\u00A9 2019";
        System.out.println(printString);

        String numberStr = "10";
        int myInt = 10;
        numberStr += myInt; // even ints or doubles are appended to the end of the string

        System.out.println(numberStr);
    }
}
