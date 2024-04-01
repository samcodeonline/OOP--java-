import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.print("No of Students: ");
            Scanner totalStudent = new Scanner(System.in);
            int studentCount;
            studentCount = totalStudent.nextInt();
            String[] studentNames = new String [studentCount];
            System.out.print ("No of Subjects: ");
            int subjectCount;
            Scanner totalSubjects = new Scanner(System.in);
            subjectCount = totalSubjects.nextInt();
            String[] subjectNames = new String[subjectCount];

            String[] nameOfSubject = new String[subjectCount];
            System.out.println("Enter Subject Names: ");
            for(int priSubName = 0 ; priSubName < subjectNames.length; priSubName++){
                    System.out.println("Subject" + priSubName + " :");
                    nameOfSubject[priSubName] = s.next();
            }

            int marks[][] = new int[studentCount][subjectCount];
            for(int students = 0 ; students < studentNames.length; students++){
                    System.out.print ("\n") ;
                    System.out.print ("Student Name" + ": ");
                    studentNames[students] = s.next();
                    for (int subjects = 0 ; subjects < subjectNames.length; subjects++){

                            System.out.println("Subject" + subjects+1 + " Marks: ");
                            marks[students][subjects] = s.nextInt();
                    }
            }

            System.out.println("Name\t");
            for(int tableHeader = 0 ; tableHeader < subjectCount ; tableHeader++){
                    System.out.print(nameOfSubject[tableHeader] + "\t");
            }

            System.out.println("Obtained\tTotal\tPercent\tGrade");

            for(int students = 0; students < studentNames.length; students++){
                    System.out.print ("\n");
                    System.out.print (studentNames[students] + "\t");
                    double obtainedMarks = 0;
                    for (int subjects = 0; subjects < subjectNames.length; subjects++){

                            System.out.print (marks[students][subjects] + "\t");
                            obtainedMarks += marks[students][subjects];
                    }
            }

    }
}