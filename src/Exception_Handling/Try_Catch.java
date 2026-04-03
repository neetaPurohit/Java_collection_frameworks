package Exception_Handling;

public class Try_Catch {
    static void main(String[] args) {
//        compile time error
        int arr[] = new int[5];
        System.out.println("Hello world");
//        try {
//            int result = 5/0;
//            System.out.println(arr[8]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Tried to access the out of bound element.");
//        }catch (ArithmeticException e){
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }
//        or
        try {
            int result = 5/0;
            System.out.println(arr[8]);
        }catch (Exception e){
            System.out.println("All exceptions handled");
        }

        System.out.println("Bye world");
    }
}
