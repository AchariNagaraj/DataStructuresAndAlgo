class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] s1_arr=new int[26];
        int[] s2_arr=new int[26];
        int i=0,j=0;
        //initial array of s1
        for(int k=0;k<s1.length();k++){
            s1_arr[s1.charAt(k)-'a']++;
        }
        //building initial window
        for(;j<s1.length();j++){
            s2_arr[s2.charAt(j)-'a']++;
        }
        j--;
        while(j<s2.length()){
            if(Arrays.equals(s1_arr,s2_arr)){
                return true;
            }
            //move i
            //before moving decrement freq of [i];
            s2_arr[s2.charAt(i)-'a']--;
            i++;
            j++;
            if(j<s2.length()){
                s2_arr[s2.charAt(j)-'a']++;
            }
        }
        return false;
    }
}