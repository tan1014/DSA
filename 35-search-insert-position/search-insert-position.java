class Solution {
    public int searchInsert(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int idx = 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > target){
                high = mid -1;
            }else if(arr[mid] < target){
                low =  mid + 1;
            }else{
                return mid;
                
            }
        }
        return low;
        
    }
}