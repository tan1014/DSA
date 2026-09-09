class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] merge = new int[n+m];
        int k = 0;
        for(int i = 0 ; i < m;i++){
            merge[k] = arr1[i];
            k++;
        }

        for(int i = 0;i< n;i++){
            merge[k] = arr2[i];
            k++;
        }
        Arrays.sort(merge);

        int total = merge.length;
        if(total % 2 == 1){
            return merge[total/2];
        }else{
            return (merge[total/2 -1] + merge[total/2]) / 2.0;
        }
        
    }
}