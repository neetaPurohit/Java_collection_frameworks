package Java_Generics_Wrapper_Classes;

public class BoundedGeneric {
    //bounded cause support only number like int float double
     <E extends Number> void doubleData(E data){
        System.out.println(data);
    }
    static void main(String[] args) {
      BoundedGeneric obj = new BoundedGeneric();
      obj.doubleData(232);
      obj.doubleData(22.232);
      obj.doubleData(1333);
      //obj.doubleData("hey");//not supported
    }
}
