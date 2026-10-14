public class functioncall2 {
    public static String fun()
    {
        return "suresh";
    }
    public static String fun2()
    {
        return "coding";
    }

    public static int num()
    {
        return 1;
    }
    public static void main(String[] args) {
        String s=fun();
        String c=fun2();
        int n=num();

        System.out.println(s);
        System.out.println(c);
        System.out.println(n);
    }
}
