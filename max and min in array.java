class  musaib{
    //program to print maximum in array
    public static void main(String[] args)
    {
        int[] arr={0,1,2,3};
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
                
            }
            
        }
        System.out.println("max is :" + max);
        // program to print minimum in array

        
        int[] arr2={0,1,2,3};
        int min=0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]<max) {
                min=arr2[i];
                
            }
            
        }
        System.out.println("min is :" + min);
        
    }
}