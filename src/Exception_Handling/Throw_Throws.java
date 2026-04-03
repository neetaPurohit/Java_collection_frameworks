package Exception_Handling;

public class Throw_Throws {
    public static int getNumberFromArray(int a[]) throws ArithmeticException{
        return a[8];
    }
    static void main(String[] args) {
      int arr[] = new int[5];

//      might get error
        try {
            getNumberFromArray(arr);
        }catch (Exception e){
            System.out.println("caught the exception " + e.getMessage());
        }
    }
}
