package Java_Generics_Wrapper_Classes;

public class GenericMethod {

    //generic method
    static <E> void printData(E data){
        System.out.println(data);
    }

    <V> void doubleData(V data){
        System.out.println(data);
    }



    static void main(String[] args) {
      printData("hello nikki");
      printData(123);


//      we cannot use directly double data cause it's type is void so instead we create object
//        of our class and use it. it's called bounded generic
      GenericMethod obj = new GenericMethod();
      obj.doubleData("abc");
      obj.doubleData(124);




//      CustomClass object
        CustomClass custom = new CustomClass();
        obj.doubleData(custom);
    }
}

class CustomClass{

}