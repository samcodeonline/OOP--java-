import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.*;

class Student implements Serializable{
    int serialNumber;
    String studentName;
    String studentUserName;

    Student(int serialNumber, String studentName, String studentUserName){
        this.serialNumber = serialNumber;
        this.studentName = studentName;
        this.studentUserName = studentUserName;
    }

    @Override
    public String toString() {
        return serialNumber + " " + studentName + " " + studentUserName;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
         int choice = -1;
         Scanner s = new Scanner(System.in);
         Scanner s1 = new Scanner(System.in);
         File file = new File("Student.txt");
         ArrayList<Student> al = new ArrayList<Student>();
         ObjectOutputStream oos = null;
         ObjectInputStream ois = null;
         ListIterator li = null;

         if(file.isFile()){
             ois = new ObjectInputStream(new FileInputStream(file));
             al = (ArrayList<Student>) ois.readObject();
             ois.close();
         }
         do{
             System.out.println("1.Insert Data");
             System.out.println("2.Display Data");
             System.out.println("3.Search Data");
             System.out.println("4.Delete Data");
             System.out.println("5.Update Data");

             System.out.println("0.Exit");
             System.out.println("Enter Your Choice: ");
             choice = s.nextInt();

             switch (choice){
                 case 1:
                     System.out.println("Enter how many Students you want");
                     int n = s.nextInt();
                     for(int i = 0 ; i < n ; i++) {
                         System.out.print ("Enter Student No: ");
                         int serialNumber = s.nextInt();
                         System.out.print ("Enter Student Name: ");
                         String studentName = s1.nextLine();
                         System.out.print ("Enter Student studentUserName: ");
                         String studentUserName = s1.nextLine();

                         al.add(new Student(serialNumber, studentName, studentUserName));
                     }
                     oos = new ObjectOutputStream(new FileOutputStream(file));
                     oos.writeObject(al);
                     oos.close();
                 break;
                 case 2:
                     if(file.isFile()){
                     ois = new ObjectInputStream(new FileInputStream(file));
                     al = (ArrayList<Student>) ois.readObject();
                     ois.close();
                     System.out.println("-----------------------------------");
                     li = al.listIterator();
                     while(li.hasNext()) {
                         System.out.println(li.next());
                         System.out.println("-----------------------------------");
                     }
                     }else{
                         System.out.println("File not found");
                     }
                 break;
                 case 3:
                     if(file.isFile()){

                         ois = new ObjectInputStream(new FileInputStream(file));
                         al = (ArrayList<Student>) ois.readObject();
                         ois.close();

                     boolean found = false;
                     System.out.println("Enter serialNumber to Search: ");
                     int serialNumber = s.nextInt();
                     System.out.println("-----------------------------------");
                     li = al.listIterator();
                     while(li.hasNext()){
                         Student e = (Student) li.next();
                         if(e.serialNumber == serialNumber){
                             System.out.println(e);
                             found = true;
                         }
                     }
                         System.out.println("---------------------------------");
                         if(!found){
                             System.out.println("Record Not Found...!");
                             System.out.println("-----------------------------------");
                         }
                     }else {
                         System.out.println("File Not Found");
                     }
                     break;
                 case 4:
                     if(file.isFile()){

                         ois = new ObjectInputStream(new FileInputStream(file));
                         al = (ArrayList<Student>) ois.readObject();
                         ois.close();

                         boolean found = false;
                         System.out.println("Enter serialNumber to Delete: ");
                         int serialNumber = s.nextInt();
                         System.out.println("-----------------------------------");
                         li = al.listIterator();
                         while(li.hasNext()){
                             Student e = (Student) li.next();
                             if(e.serialNumber == serialNumber){
                                 li.remove();
                                 found = true;
                             }
                         }
                         if(found){
                             oos = new ObjectOutputStream(new FileOutputStream(file));
                             oos.writeObject(al);
                             oos.close();
                             System.out.println("Record Deleted Successfully...!");
                         }
                         else{
                             System.out.println("Record Not Found...!");
                         }
                         System.out.println("-----------------------------------");
                     }else {
                         System.out.println("File Not Found");
                     }
                     break;

                 case 5:
                     if(file.isFile()){

                         ois = new ObjectInputStream(new FileInputStream(file));
                         al = (ArrayList<Student>) ois.readObject();
                         ois.close();

                         boolean found = false;
                         System.out.println("Enter serialNumber to Update: ");
                         int serialNumber = s.nextInt();
                         System.out.println("-----------------------------------");
                         li = al.listIterator();
                         while(li.hasNext()){
                             Student e = (Student) li.next();
                             if(e.serialNumber == serialNumber){
                                 System.out.println("Enter New Student : ");
                                 String studentName = s1.nextLine();
                                 System.out.print("Enter new studentUserName: ");
                                 String studentUserName = s1.nextLine();
                                 li.set(new Student(serialNumber,studentName,studentUserName));
                                 found = true;
                             }
                         }
                         if(found){
                             oos = new ObjectOutputStream(new FileOutputStream(file));
                             oos.writeObject(al);
                             oos.close();
                             System.out.println("Record Updated Successfully...!");
                         }
                         else{
                             System.out.println("Record Not Found...!");
                         }
                         System.out.println("-----------------------------------");
                     }else {
                         System.out.println("File Not Found");
                     }
                     break;
             }
         }while(choice != 0);
    }
}







