class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int m  =arr1.length;
        int n = arr2.length;
        int[] merge = new int[m + n];
        int k = 0;
        for(int i = 0; i <m;i++){
            merge[k]= arr1[i];
            k++;
        }

        for(int i = 0; i < n;i++){
            merge[k] = arr2[i];
            k++;
        }

        Arrays.sort(merge);

        int klen = merge.length;
        if(klen % 2 == 1){
            return  merge[klen/2];
        }else{
            return (merge[klen/2 -1] + merge[klen/2]) / 2.0;
        }


        
    }
}