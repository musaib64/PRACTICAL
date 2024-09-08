public class average {
    //program to find average of an array elements
    public static void main(String[] args) {
        int[] arr={0,1,2,3};
        int sum=0;
        int avg=0;
       
        
        for (int i = 0; i < arr.length; i++) {
            
            sum=arr[i]+=sum;
            avg=sum/4;
           
            
                
            
        }
        System.out.println("average is   :" + avg );
        
    }

}
