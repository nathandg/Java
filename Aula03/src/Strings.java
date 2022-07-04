import models.Constants;
import models.JavaClass;

public class Strings {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        JavaClass obj = new JavaClass();

        obj.setMyInt(10);
        System.out.println(obj);

        String otherString = Constants.HELLO_WORLD;

        String myString = obj.toString();
        System.out.println(myString.toUpperCase());

        if (otherString.equalsIgnoreCase(myString)){
            System.out.println("É igual");
        }else {
            System.out.println("não são igual");
        }

        //cut string
        String subString = otherString.substring(0, 4);
        System.out.println(subString);

        //replace string and remove spaces
        String replace = otherString.replace("hello", "");
        System.out.println(replace.trim());

        int wo = otherString.lastIndexOf("hello");
        System.out.println("wo = " + wo);

        //split string

        String splitString = "Nathan Diogo (43)98445-1354";

        String[] strings = splitString.split(" ");

        for (int i = 0; i < strings.length; i++) {
            System.out.println("strings[" + i + "] = " + strings[i]);

        }



    }

}
