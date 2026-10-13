import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean palindrome=true;
        int n=s.length();
        for(int i=0; i<n/2; i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                palindrome=false;
            }
        }
        if(palindrome)
        {
            System.out.println("is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}