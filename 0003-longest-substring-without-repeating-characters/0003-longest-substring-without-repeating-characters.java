class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int maxLength=0;
        int[] lastIndex=new int[128];
        Arrays.fill(lastIndex,-1);
        while(j<s.length()){
            char ch=s.charAt(j);     
            if(lastIndex[ch]!=-1){
                while(i<=lastIndex[ch]){
                    lastIndex[s.charAt(i)]=-1;//make window invalid
                    i++;
                }
                
            }
            lastIndex[ch]=j;
            maxLength=Math.max(maxLength,j-i+1);
            j++;
            
        }
        return maxLength;
        
    }
}