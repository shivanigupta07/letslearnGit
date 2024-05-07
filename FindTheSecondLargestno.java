public class FindTheSecondLargestNumber {
    public static void main(String args[]){
        int [] arr={10,6,8,5,3,6};
        int max=SecondLargest(arr);
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                ans=Math.max(ans, arr[i]);
           }
        }
        System.out.println(ans); }
   public static int SecondLargest(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                    max=arr[i];
                }
            }
            return max;