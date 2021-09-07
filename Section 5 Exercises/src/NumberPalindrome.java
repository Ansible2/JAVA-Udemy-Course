public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        StringBuilder numberStrBuffer = new StringBuilder(String.valueOf(number));
        numberStrBuffer.reverse();
        String numberAsString = numberStrBuffer.toString();
        int numberReversed = Integer.parseInt(numberAsString);

        return numberReversed == number;
    }
}
