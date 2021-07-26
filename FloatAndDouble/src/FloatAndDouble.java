public class FloatAndDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);


        //int myIntValue = 5;
        //float myFloatValue = 5.25f;
        //double myDoubleValue = 5.25d; // double is the assumed default fraction type

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00; // double is the assumed default fraction type
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        // both examples work
        double oneDouble = 3.14_526_1d;
        double anotherDouble = 3.145261;

        convertKilogramsToPoundsAndPrint(200);
    }

    public static void convertKilogramsToPoundsAndPrint(double pounds){
        double amountInPounds = 0;
        amountInPounds = pounds * 0.45359237;
        System.out.println(amountInPounds);
    }
}
