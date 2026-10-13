import java.util.Scanner;
public class palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        String ans="";
        s=sc.next();
        for(int i=s.length()-1; i>=0; i--)
        {
            ans=ans+s.charAt(i);
        }
        
        if(ans.equals(s))
        {
            System.out.println("is a palindrome string");
        }
        else{
            System.out.println("not a palindrome string");
        }
    }
}
