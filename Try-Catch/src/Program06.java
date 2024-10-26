public class Program06 {
    public static void main(String[] args) {
        try
        {
            String str = null;
            System.out.println(str.length());
        }catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by  zero :");
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index out of Bound : ");
        } catch (Exception e) {
            System.out.println("Parent class Exception :");
        }
        System.out.println("rest of the code : ");
    }
}
