public class Main {

    public static void main(String[] args) {
    /*
        var newScore = calculateScore("Tim",500);
        System.out.println(newScore);
        System.out.println(calculateScore(500));
        System.out.println(calculateScore());
    */

        var cm = calcFeetAndInchesToCentimeters(6,-10);
        System.out.println(cm);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name or player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet < 0 || (inches > 12 || inches < 0)){
            return -1;
        }

        int totalInches = (feet * 12) + inches;
        return calcFeetAndInchesToCentimeters(totalInches);
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if (inches < 0){
            return -1;
        }

        return (double)inches * 2.54;
    }


}
