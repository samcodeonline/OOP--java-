import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomWithMathRandom = (int) ((Math.random() * (3 - 0)) + 0);
        Scanner gameInput = new Scanner(System.in);
        String[] gameCharacters = {"Rock", "Paper", "Scissor" };


        System.out.println("How many times you want to play game: ");
        int playGame = gameInput.nextInt();
        int i = 1;
        while(i <= playGame){
            System.out.println("Type (Rock , Paper , Scissor): ");
            String rockPaperScissors = gameInput.next();
            
            i++;
        }
    }
}