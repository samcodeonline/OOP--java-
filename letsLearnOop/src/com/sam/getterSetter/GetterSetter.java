
package com.sam.getterSetter;

//class encapsulation{
//    private String name;
//    private int number;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getNumber() {
//        return number;
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//    }
//}
public class GetterSetter {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        GetterSetter getset = new GetterSetter();
        getset.setName("samcodeonline");
        getset.setNumber(23);
        System.out.println(getset.getName());
        System.out.println(getset.getNumber());
    }
}
