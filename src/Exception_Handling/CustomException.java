package Exception_Handling;

import java.util.Scanner;

public class CustomException {
    static void main(String[] args) throws MyException  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");



        try {
            int age = sc.nextInt();
            if (age>100){
                throw new MyException("My error is this ");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}


//my exception (built by user)
class MyException extends Exception{
    public MyException(String message){
         super(message);
    }
}