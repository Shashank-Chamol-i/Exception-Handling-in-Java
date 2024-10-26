public class Program04 {
    public static void main(String[] args) {
        try
        {
            int[]arr = new int[5];
            System.out.println(arr[10]);
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
