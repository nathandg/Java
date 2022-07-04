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

    public void som2numbers(int a, int b){
        System.out.println(a + b);
    }


}
