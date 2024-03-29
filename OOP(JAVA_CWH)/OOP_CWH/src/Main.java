import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.*;

class Employee implements Serializable{
    int empno;
    String ename;
    int salary;

    Employee(int empno, String ename, int salary){
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empno + " " + ename + " " + salary;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
         int choice = -1;
         Scanner s = new Scanner(System.in);
         Scanner s1 = new Scanner(System.in);
         File file = new File("employee.txt");
         ArrayList<Employee> al = new ArrayList<Employee>();
         ObjectOutputStream oos = null;
         ObjectInputStream ois = null;
         ListIterator li = null;

         if(file.isFile()){
             ois = new ObjectInputStream(new FileInputStream(file));
             al = (ArrayList<Employee>) ois.readObject();
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
                     System.out.println("Enter how many employees you want");
                     int n = s.nextInt();
                     for(int i = 0 ; i < n ; i++) {
                         System.out.print ("Enter Employee No: ");
                         int empno = s.nextInt();
                         System.out.print ("Enter Employee Name: ");
                         String empname = s1.nextLine();
                         System.out.print ("Enter Employee salary: ");
                         int salary = s.nextInt();

                         al.add(new Employee(empno, empname, salary));
                     }
                     oos = new ObjectOutputStream(new FileOutputStream(file));
                     oos.writeObject(al);
                     oos.close();
                 break;
                 case 2:
                     if(file.isFile()){
                     ois = new ObjectInputStream(new FileInputStream(file));
                     al = (ArrayList<Employee>) ois.readObject();
                     ois.close();
                     System.out.println("-----------------------------------");
                     li = al.listIterator();
                     while(li.hasNext())
                         System.out.println(li.next());
                         System.out.println("-----------------------------------");
                     }else{
                         System.out.println("File not found");
                     }
                 break;
                 case 3:
                     if(file.isFile()){

                         ois = new ObjectInputStream(new FileInputStream(file));
                         al = (ArrayList<Employee>) ois.readObject();
                         ois.close();

                     boolean found = false;
                     System.out.println("Enter empno to Search: ");
                     int empno = s.nextInt();
                     System.out.println("-----------------------------------");
                     li = al.listIterator();
                     while(li.hasNext()){
                         Employee e = (Employee) li.next();
                         if(e.empno == empno){
                             System.out.println(e);
                             found = true;
                         }
                     }
                         if(!found)
                             System.out.println("Record Not Found...!");
                             System.out.println("-----------------------------------");
                     }else {
                         System.out.println("File Not Found");
                     }
                     break;
                 case 4:
                     if(file.isFile()){

                         ois = new ObjectInputStream(new FileInputStream(file));
                         al = (ArrayList<Employee>) ois.readObject();
                         ois.close();

                         boolean found = false;
                         System.out.println("Enter empno to Delete: ");
                         int empno = s.nextInt();
                         System.out.println("-----------------------------------");
                         li = al.listIterator();
                         while(li.hasNext()){
                             Employee e = (Employee) li.next();
                             if(e.empno == empno){
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
                         al = (ArrayList<Employee>) ois.readObject();
                         ois.close();

                         boolean found = false;
                         System.out.println("Enter empno to Update: ");
                         int empno = s.nextInt();
                         System.out.println("-----------------------------------");
                         li = al.listIterator();
                         while(li.hasNext()){
                             Employee e = (Employee) li.next();
                             if(e.empno == empno){
                                 System.out.println("Enter New Employee : ");
                                 String ename = s1.nextLine();
                                 System.out.print("Enter new Salary: ");
                                 int sal = s.nextInt();
                                 li.set(new Employee(empno,ename,sal));
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







