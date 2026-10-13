public class dividedby2and3 {
    public static void main(String[] args) {
        int arr[]={1,4,6,8,9,4,3,6,5,9};
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            int temp = arr[i];
            if(temp%2==0 && temp%3==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
