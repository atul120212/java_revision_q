public class binary_search {
    
    public static int binarySearch(int numbers[], int key){

        int start = 0, end = numbers.length-1;
        while(start<=end){
            int mid = (end + start)/2;
            if(numbers[mid]==key){
                return mid;
            }
            else if(numbers[mid]<key){
            start = mid+1;
        }
        else{
            end = mid-1;
        }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7,8};
        System.out.println("index for key is:"+binarySearch(numbers, 8));
    }
    
}
