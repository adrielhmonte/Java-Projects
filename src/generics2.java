//import java.util.ArrayList;

public class generics2 {

    public static void main(String[] args) {

        MyGenericClass <Double, Integer> myDouble = new MyGenericClass<>(3.14,6);
        MyGenericClass <Integer, Double>  myInt = new MyGenericClass<>(1,2.34);
        //MyGenericClass <Character> myChar = new MyGenericClass<>('@');
        //MyGenericClass <String> myString = new MyGenericClass<>("Hello");

        //ArrayList <String> myFriends = new ArrayList<>(null);

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        //System.out.println(myChar.getValue());
        //System.out.println(myString.getValue());

    }
    
}
