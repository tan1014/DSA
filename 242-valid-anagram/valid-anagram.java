class Solution {
    public boolean isAnagram(String s1, String s2) {
        // if(s1.length() != s2.length()){
        //     return false;
        // }

        // char arr[] = s2.toCharArray();

        // boolean isAnagram = true;

        // for(int i = 0 ; i < s1.length();i++){
        //     boolean isfound = false;

        //     for(int j = 0 ; j < arr.length;j++){
        //         if(s1.charAt(i) ==  arr[j]){
        //             arr[j] = '*';
        //             isfound = true;
        //             break;
        //         }
        //     }
        //     if(!isfound){
        //         isAnagram = false;
        //         break;
        //     }
        // }
        // return isAnagram;

        if(s1.length() != s2.length()){
            return false;
        }

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);

    }
}