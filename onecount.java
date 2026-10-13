public class onecount{
    public static void main(String[] args) {
        int arr[]={1,4,5,8,2,1,9,0,1,4,3,2,1,6,1,8,4,1};
        int ans=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==1)
            {
                ans=ans+1;
            }

        }
        System.out.println(ans);
        }
    }
