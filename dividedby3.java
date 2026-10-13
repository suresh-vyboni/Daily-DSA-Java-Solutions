public class dividedby3 {
    public static void main(String[] args) {
        int arr[]={3,5,3,2,6,7,9,16,18};
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(i%3==0)
            {
                count++;
            }
        }
        
        System.out.println(count);

    }
}
