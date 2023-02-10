public class ExceptionTryCatch {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Exception to show Catch ,Finally and Exception in thread "main" java.lang.NumberFormatException
        try {
            throw new ArithmeticException();
        } catch (Exception e) {
            System.out.println("Catch");
            throw new NullPointerException();
        } finally {
            System.out.println("Finally");

            throw new NumberFormatException();
        }
    }

}
