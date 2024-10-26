public class Program02 {
    public static void main(String[] args) {
        int num = 50;
        int denum = 0;
        int result = 0;
        try
        {
            result = num/denum;
        }catch (ArithmeticException e)
        {
            result = num/(denum+2);
            System.out.println(result);
        }
    }
}
