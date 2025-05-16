package java_internal;
public class twenty {
    static void checkEven(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("Number is odd!");
        } else {
            System.out.println("Number is even: " + number);
        }
    }
    public static void main(String[] args) {
        try {
            checkEven(4);  
            checkEven(7);  
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
