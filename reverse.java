import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        String s;
        String ans="";
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        for(int i=5; i>=0; i--)
        {
           ans= ans+s.charAt(i);
        }
        System.out.println(ans);
    }
}
