public class Main {
    public static void main(String[] args){
        char myChar = 'D';
        char myUnicodeChar = '\u0044'; // chars support unicode
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        boolean myTrueBool = true;
        boolean myFalseBool = false;

        if (myTrueBool) {
            System.out.println(myTrueBool);
        }
        if (!myFalseBool){
            System.out.println(myFalseBool);
        }
    }
}
