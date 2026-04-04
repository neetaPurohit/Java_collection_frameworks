package Java_Generics_Wrapper_Classes;

public class Objects {
    static void main(String[] args) {
//        different ways to assign a value:-
        Integer obj1 = new Integer(12);
        Integer obj2 = Integer.valueOf(12);
        Integer obj3 = 12; //autoboxing - convert int to Integer

        Boolean bool = Boolean.valueOf(false);
        Integer obj4 = Integer.valueOf("12"); //convert string to int

        int age = obj1; //unboxing  - convert Integer obj. to int
    }
}
