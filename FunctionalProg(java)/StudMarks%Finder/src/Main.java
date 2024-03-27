import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        int obtainedMarks = 0 , subjectMarksInput;
        Scanner marks = new Scanner(System.in);
        System.out.print("Type total marks: ");
        int totalMarks = marks.nextInt();
        System.out.print ("Enter number of  Subjects: ");
        int totalSubjects = marks.nextInt();
        for(int i = 1 ; i <= totalSubjects; i++){
            System.out.print("Subject " + i + ": ");
            subjectMarksInput = marks.nextInt();
            obtainedMarks = obtainedMarks + subjectMarksInput;
        }
        System.out.println("The total sum is : " + obtainedMarks);
        System.out.println( "The percentage of the student is : " +  obtainedMarks * 100 / totalMarks  + "%" );

    }
}