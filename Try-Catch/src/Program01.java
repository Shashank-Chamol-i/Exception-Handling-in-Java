public class Program01 {
    public static void main(String[] args) {
        try
        {
            int result = 50 /0;
            System.out.println("Statement 1 not print because after the error statement :");
        }catch(ArithmeticException e)
        {
            System.out.println("Cannot divided by zero");
        }
        System.out.println("Problem not resolved but error handled safely : ");
    }
}
