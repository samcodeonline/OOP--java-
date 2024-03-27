import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int studentCount, subjectCount ;


            System.out.print("No of Students: ");
            Scanner totalStudent = new Scanner(System.in);
              if (totalStudent.hasNextInt()) {
                studentCount = totalStudent.nextInt();
              }

            int[] arr = new int[studentCount];
//            String[] studentNames = new String [arr];
            System.out.print("No of Subjects: ");
            Scanner totalSubject = new Scanner(System.in);
            studentCount = totalSubject.nextInt();

// 		code for adding the header items for the subject
            String nameOfSubject[subjectCount];
            System.out.println("Enter Subject Names: ");
            for(int printSubjectName = 0 ; printSubjectName < subjectCount ; printSubjectName++){
                System.out.println("Subject" + printSubjectName + 1 + " :");
                cin >> nameOfSubject[printSubjectName];
            }
// 		code for taking the names,marks from the user
            int marks[studentCount][subjectCount];
            for(int stu=0; stu<studentCount; stu++){
                System.out.println( "\n");
                System.out.println("Student Name" + ": ");
                cin >> studentNames[stu];

                for (int sub=0; sub<subjectCount; sub++){
                    System.out.println("Subject" + sub+1 + " Marks: ");
                    cin >> marks[stu][sub];
                }
            }
        System.out.println("\n");
//		code for totalMarks
            double totalMarks = 300;
        System.out.println("Total Marks (marksCap (300)) :" + totalMarks );
        System.out.println("\n");

            //code for printing the header items of the table 
            System.out.println("\n\n");
            System.out.println("Name\t");
            for(int tableHeader = 0 ; tableHeader < subjectCount ; tableHeader++){
                System.out.println(nameOfSubject[tableHeader] + "\t");
            }
            System.out.println("Obtained\tTotal\tPercent\tGrade");

            // code for printing the names,marks from the user	
            for(int stu=0; stu<studentCount; stu++){

                System.out.print("\n");
                System.out.print(studentNames[stu] + "\t")  ;

                double obtainedMarks = 0;
                for (int sub=0; sub<subjectCount; sub++){
                    System.out.print(marks[stu][sub] + "\t");
                    obtainedMarks += marks[stu][sub];
                }
                System.out.print(obtainedMarks + "\t\t");
                System.out.print(totalMarks + "\t");

                int percentageEvaluation=0;
                percentageEvaluation = (obtainedMarks/totalMarks)*100;

                System.out.print( percentageEvaluation + "%" + "\t" );
                // 				string Grade[percentageEvaluation];
                int studentGrade;
                studentGrade = percentageEvaluation;
                if(studentGrade >= 85){
                    System.out.print("A");
                }
                else if(studentGrade > 70 && studentGrade < 85){
                    System.out.print("B");
                }
                else if(studentGrade > 50 && studentGrade < 70){
                    System.out.print("C");
                }
                else if(studentGrade > 30 && studentGrade < 50 ){
                    System.out.print("D");
                }
                else{
                    System.out.print("F");
                }
            }
            

    }
}