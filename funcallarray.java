public class funcallarray {
    public static int[] fun()
    {
        int arr[]={3,4,5,6,7,8};
        return arr;
    }
   public static void main(String[] args) {
       
        int suresh[]=fun();
        for(int i=0; i<suresh.length; i++)
        {
            System.out.println(suresh[i]);
        }
   }
    }

