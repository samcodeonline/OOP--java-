import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            int studentCount, subjectCount ;

            System.out.print("No of Students: ");
            Scanner totalStudent = new Scanner(System.in);
            studentCount = totalStudent.nextInt();

            String[] studentNames = new String [studentCount];

            System.out.println(  studentNames.length);
            System.out.print("No of Subjects: ");
            Scanner totalSubject = new Scanner(System.in);
            subjectCount = totalSubject.nextInt();

            String[] nameOfSubject = new String [subjectCount];

            System.out.println("Enter Subject Names: ");
            for(int printSubjectName = 0 ; printSubjectName <= nameOfSubject.length ; printSubjectName++) {
                    System.out.println("Subject " + printSubjectName + 1 + " :");
                    Scanner subjectNames = new Scanner(System.in);
                    String subject_Names = subjectNames.nextLine();
                    nameOfSubject[printSubjectName] = subject_Names;
            }
    }
}