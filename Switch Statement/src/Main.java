import java.util.Scanner;

public class Main {

    public static void printDayOfTheWeek_switch(int day){
        switch (day){
            case 0:{
                System.out.println("Sunday");
                break;
            }
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            default:{
                System.out.println("Invalid Day");
                break;
            }

        }
    }

    public static void printDayOfTheWeek_ifElse(int day){
        if (day == 0){
            System.out.println("Sunday");

        } else if (day == 1){
            System.out.println("Monday");

        } else if (day == 2){
            System.out.println("Tuesday");

        } else if (day == 3){
            System.out.println("Wednesday");

        } else if (day == 4){
            System.out.println("Thursday");

        } else if (day == 5){
            System.out.println("Friday");

        } else if (day == 6){
            System.out.println("Saturday");

        } else {
            System.out.println("Invalid Day");

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner inScanner = new Scanner(System.in);
        int switchValue = inScanner.nextInt();

        //printDayOfTheWeek_ifElse(switchValue);
        //printDayOfTheWeek_switch(switchValue);
    /*
        switch (switchValue){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5: // how to do multiple values having the same output for switch
                System.out.println("It was 3, 4, or 5");
                break;
            case 6:{ // you can use code blocks too in certain versions of Java
                System.out.println("stuff");
                break;
            }
            default:
                System.out.println("Value is not defined");
                break; // not needed for default but recommended
        }

    */
    }


}
