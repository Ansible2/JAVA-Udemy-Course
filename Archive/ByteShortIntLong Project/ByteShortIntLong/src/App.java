public class App {
    public static void main(String[] args) throws Exception {
    
        int myValue = 10_000; // underscores are allowed in numbers in Java 7 and higher

        int myMin = Integer.MIN_VALUE;
        int myMax = Integer.MAX_VALUE;

        //System.out.println(myMin);
        //System.out.println(myMax);
        //System.out.println("Busted Max: " + (myMax + 1));


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        //System.out.println(myMinByteValue);
        //System.out.println(myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        //System.out.println(myMinShortValue);
        //System.out.println(myMaxShortValue);

        long myLongValue = 100L; // need the "l" when defining long literals
        //long bigLong = 2147483647_4; // ERROR treated like an int because the compiler will convert to int without L
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        //System.out.println(myMinLongValue);
        //System.out.println(myMaxLongValue);
      
        // casting
        int myTotal = (myMin / 2);
        //byte myNewByteValue = (myMinByteValue / 2); // can't convert 2 to byte
        byte myNewByteValue = (byte) (myMinByteValue / 2);
    }
}
