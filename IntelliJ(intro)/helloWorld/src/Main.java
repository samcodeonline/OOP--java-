import java.util.*;

class Main {
    public static void main(String[] args) {
            int studentCount = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total elements to sort");
        Scanner inputCount = new Scanner(System.in);
        studentCount = inputCount.nextInt();
        String[] array = new String[studentCount];

        System.out.println("Please enter names to sort");

        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextLine();
        }
        for(int i = 0 ; i < array.length; i++){
            System.out.println(array[i]);
        }

        //Just to test
//        System.out.println(array[0]);
    }
}




