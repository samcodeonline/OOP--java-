
public class Main {
    static void myMethod() {
        System.out.println("Hello World!");
    }
    int sum = 23;
    int numericValue;
    static void myDevice(){
       System.out.print(" are you doing great");
    }
    static void sumTwoNumber(int numOne , int numTwo){
        System.out.print(numOne + numTwo);
    }
    public Main(int y){
        numericValue = y;
    }
    public static void main(String[] args) {
        myMethod();

        Main myObjNum = new Main(5);
        System.out.println(myObjNum.numericValue);
        Main myObj = new Main(3);
        System.out.print(myObj.sum);
        System.out.print("\n");
        myDevice();
        System.out.print("\n");
        sumTwoNumber(23,32);
        System.out.print("\n");
    }
}