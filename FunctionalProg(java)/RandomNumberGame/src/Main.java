import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------RandomNumberGame-----------------------");
        Random rand = new Random(System.currentTimeMillis());
        double saveRandomNumber =  random() % 110;
        int gameNumber = 0;
        int loopNumber = 0;
        do{
            System.out.print("\n");
            System.out.print ( "Turn " + loopNumber + 1 + ":" );

//            taking the input from users
            System.out.print (gameNumber);
            if(gameNumber == saveRandomNumber){
                System.out.print("Congratulations!! You Win.");
                break;
            }
            else{
                loopNumber++;
            }
        }
        while(loopNumber < 5);
    }
}