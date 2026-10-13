class multilevel
{
    void fun1()
    {
    System.out.println("1st layer");
    }
}
class multilevel2 extends multilevel
{
    void fun2()
    {
        System.out.println("2nd layer");
    }
}
class multilevel3 extends multilevel2
{
    void fun3()
    {
        System.out.println("3rd layer");
    }
}
class Main
{
    public static void main(String args[])
    {
        multilevel3 s=new multilevel3();

        s.fun1();
        s.fun2();
        s.fun3();
    }
}
