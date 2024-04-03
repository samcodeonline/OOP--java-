import java.io.*;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;
class Student implements Serializable {
    int studentId;
    String studentName;
    String studentUsername;

        Student(int studentId, String studentName, String studentUsername){
            this.studentId = studentId;
            this.studentName = studentName;
            this.studentUsername = studentUsername;
        }
        public String toString(){
            return studentId + " " + studentName + " " + studentUsername;
        }
}

public class Main {
    public static void main(String[] args) throws Exception {
        int choice = -1;
        Scanner scanIntTypes  = new Scanner(System.in);
        Scanner scanStringTypes = new Scanner(System.in);
        File studentFile = new File("student.txt");
        ArrayList<Student> array_list = new ArrayList<Student>();
        ObjectOutputStream object_output_stream = null;
        ObjectInputStream object_input_stream = null;
        ListIterator list_iterator = null;

        if (studentFile.isFile()) {
            object_input_stream = new ObjectInputStream(new FileInputStream(studentFile));
            array_list = (ArrayList<Student>) object_input_stream.readObject();
            object_input_stream.close();
        }


        do{
            System.out.println("1. Insert Data ");
            System.out.println("2. Display Data");
            System.out.println("3. Search Student Data");
            System.out.println("4. Delete Student Data");
            System.out.println("5. Update Student Data");

            System.out.println("0. Exit File");
            System.out.print("Enter Your Choice: ");
            choice = scanIntTypes.nextInt();

            switch(choice){
                case 1:
                    System.out.println("-------------InsertData---------------");
                    System.out.print ("Enter totalNumber of Student: ");
                    int studentCount = scanIntTypes.nextInt();

                    for(int i = 0 ; i < studentCount ; i++){
                        System.out.print ("SerialNo: ");
                        int studentId = scanIntTypes.nextInt();
                        System.out.print ("Enter Student Name: ");
                        String studentName =  scanStringTypes.nextLine();
                        System.out.print ("Enter Student UserName: ");
                        String studentUsername = scanStringTypes.nextLine();
                        array_list.add(new Student(studentId,studentName,studentUsername));
                    }
                    object_output_stream = new ObjectOutputStream(new FileOutputStream(studentFile));
                    object_output_stream.writeObject(array_list);
                    object_output_stream.close();
                    break;
                case 2:
                    if(studentFile.isFile()) {
                        object_input_stream = new ObjectInputStream(new FileInputStream(studentFile));
                        array_list = (ArrayList<Student>) object_input_stream.readObject();
                        object_input_stream.close();
                        System.out.println("--------------UserData--------------");
                        list_iterator = array_list.listIterator();
                        while (list_iterator.hasNext()) {
                            System.out.println(list_iterator.next());
                            System.out.println("--------------------------------");
                        }
                    }  else{
                        System.out.println("File Not Found");
                    }
                    break;

                case 3:
                    if(studentFile.isFile()) {
                        object_input_stream = new ObjectInputStream(new FileInputStream(studentFile));
                        array_list = (ArrayList<Student>) object_input_stream.readObject();
                        object_input_stream.close();
                        boolean found = false;
                        System.out.println("--------------StudentSearchedData--------------");
                        System.out.print("Enter Student Serial : ");
                        int studentId = scanIntTypes.nextInt();
                        list_iterator = array_list.listIterator();
                        while (list_iterator.hasNext()) {
                            Student student = (Student) list_iterator.next();
                            if (student.studentId == studentId) {
                                System.out.println(student);
                                found = true;
                            }
                            System.out.println("-----------------------------------");
                        } if(!found) {
                            System.out.println("Record not Found");
                        }
                    }
                    else {
                        System.out.println("File not Found");
                    }
                    break;

                case 4:
                    if(studentFile.isFile()) {
                        object_input_stream = new ObjectInputStream(new FileInputStream(studentFile));
                        array_list = (ArrayList<Student>) object_input_stream.readObject();
                        object_input_stream.close();
                        Boolean found = false;
                        System.out.println("--------------StudentSearchedData--------------");
                        list_iterator = array_list.listIterator();
                        System.out.print("Enter Student SerialNo to Delete : ");
                        int studentId = scanIntTypes.nextInt();
                        while (list_iterator.hasNext()) {
                            Student student = (Student) list_iterator.next();
                            if (student.studentId == studentId) {
                                list_iterator.remove();
                                found = true;
                            }
//                            System.out.println("-----------------------------------");
                        } if(found) {
                            object_output_stream = new ObjectOutputStream(new FileOutputStream(studentFile));
                            object_output_stream.writeObject(array_list);
                            object_output_stream.close();
                            System.out.println("Record Deleted SuccessFully");
                        }
                        else{
                            System.out.println("Record not Found");
                        }
                        System.out.println("-----------------------------------------");
                    }
                    else {
                        System.out.println("File not Found");
                    }
                    break;

                case 5:
                    if(studentFile.isFile()) {
                        object_input_stream = new ObjectInputStream(new FileInputStream(studentFile));
                        array_list = (ArrayList<Student>) object_input_stream.readObject();
                        object_input_stream.close();
                        Boolean found = false;
                        System.out.println("--------------StudentSearchedData--------------");
                        list_iterator = array_list.listIterator();
                        System.out.print("Enter Student SerialNo to update : ");
                        int studentId = scanIntTypes.nextInt();
                        while (list_iterator.hasNext()) {
                            Student student = (Student) list_iterator.next();
                            if (student.studentId == studentId) {
                                System.out.println("Enter Student Name: ");
                                String studentName = scanStringTypes.nextLine();
                                System.out.println("Enter Student UserName: ");
                                String studentUserName = scanStringTypes.nextLine();
                                list_iterator.set(new Student(studentId,studentName,studentUserName));
                                found = true;
                            }
                            System.out.println("-----------------------------------");
                        } if(found) {
                            object_output_stream = new ObjectOutputStream(new FileOutputStream(studentFile));
                            object_output_stream.writeObject(array_list);
                            object_output_stream.close();
                            System.out.println("Record Deleted SuccessFully");
                        }
                        else{
                            System.out.println("Record not Found");
                        }
                        System.out.println("-----------------------------------------");
                    }
                    else {
                        System.out.println("File not Found");
                    }
                    break;
            }
        }while(choice != 0);
    }
}