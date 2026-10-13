class parent {
    public void firstmethod()
    {
        System.out.println("first method");
    }
}
class child extends parent
{
    public void secondmethod()
    {
        System.out.println("second method");
    }
}

class Main
{
    public static void main(String args[])
    {
        child combine=new child();
        combine.firstmethod();
        combine.secondmethod();

    }
}