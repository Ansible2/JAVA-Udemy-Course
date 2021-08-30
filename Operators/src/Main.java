public class Main {

    public static void main(String[] args) {
        // Challenge
	    double myDouble = 20.00;
	    double mySecondDouble = 80.00;

	    double myDoubleProduct = (myDouble + mySecondDouble) * 100.00d;
	    double remainder = myDoubleProduct % 40.00d;
	    boolean myBool = (remainder == 0);

        System.out.println(myBool);

        if (!myBool) {
            System.out.println("Got some Remainder");
        }

    }
}
