public class reversestring {
    public static void main (String args[])
    {
        String s="suresh";
        String ans="";
        for(int i=5; i>=0; i--)
        {
            ans=ans+s.charAt(i);
        }
        System.out.println(ans);
    }
}
