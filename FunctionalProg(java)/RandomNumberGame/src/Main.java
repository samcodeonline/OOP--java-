import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------RandomNumberGame-----------------------");
        int saveRandomNumber = (int) ((Math.random() * (110 - 100)) + 100);
        int loopNumber = 1;
        do{
            System.out.print("\n");
            System.out.print ( "Turn " + loopNumber + ":" );
//            taking the input from users
            Scanner inputData = new Scanner(System.in);
            System.out.print("Enter first number- ");
            int gameNumber = inputData.nextInt();
            if(gameNumber == saveRandomNumber){
                System.out.print("Congratulations!! You Win.");
                break;
            }
            else{
                loopNumber++;
            }
        }
        while(loopNumber <= 5);
        System.out.print("\n");
        if(loopNumber >= 5){
            System.out.print("the expected number was " + saveRandomNumber);
        }
    }
}