import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int computerTurn = (int) ((Math.random() * (3 - 0)) + 0);
        Scanner gameInput = new Scanner(System.in);

        System.out.println("-------------------------------LET'S PLAY-------------------------------");
        System.out.println("----------------------------Computer VS Human---------------------------");
        int i = 1;
        while(i <= 1){
            System.out.println("Type (0(Rock) , 1(Paper) , 2(Scissor)): ");
            int humanTurn = gameInput.nextInt();
            System.out.println(computerTurn);
            if(humanTurn == 0 && computerTurn == 0 || humanTurn == 1 && computerTurn == 1 || humanTurn == 2 && computerTurn == 2){
                System.out.println("Draw");
            }
            else if (humanTurn == 0 && computerTurn == 1){
                System.out.println("Computer Wins");
            }
            else if(humanTurn == 1 && computerTurn == 0){
                System.out.println("Human Wins");
            }
            else if(humanTurn == 1 && computerTurn == 2){
                System.out.println("Computer Wins");
            }
            else if (humanTurn == 2 && computerTurn == 1){
                System.out.println("Human Wins");
            }
            else if(humanTurn == 0 && computerTurn == 2){
                System.out.println("Human Wins");
            }
            else if(humanTurn == 2 && computerTurn == 0){
                System.out.println("Computer Wins");
            }
            else{
                System.out.println("invalid entry");
            }
            i++;
        }
    }
}