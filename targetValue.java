public class targetValue {
    public static void findTraget(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                System.out.println("Index of "+target+" is: "+i);
            }
        }
    } 
    public static void main(String[] args) {
        int nums[] = {2,1,6,3,8,5};
        findTraget(nums, 2);
    }
    
}
