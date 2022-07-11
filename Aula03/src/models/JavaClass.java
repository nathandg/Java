package models;

public class JavaClass {

    private int myInt = 0;
    private String myString = "hello World!";

    public JavaClass() {

    }

    public JavaClass(int myInt, String myString) {
        this.myInt = myInt;
        this.myString = myString;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt){
        this.myInt = myInt;
    }

    @Override
    public String toString() {
        return "JavaClass{" +
                "myInt=" + myInt +
                ", myString='" + myString + '\'' +
                '}';
    }

    //this is a "Sobrecarga" 2 methods with same name but different parameters;
    public void som2numbers(){
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    //this methode sum numA with numB and print the result;
    public void som2numbers(int numA, int numB){
        System.out.println(numA + numB);
    }


}
