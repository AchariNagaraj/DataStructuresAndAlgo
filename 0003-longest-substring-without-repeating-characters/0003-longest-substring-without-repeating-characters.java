class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=i;
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLength=0;
        while(j<s.length()){
            int length=0;
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);//increment freq
            //record length
            
            //shrink window
            int freq=map.get(s.charAt(j));
            while(i<=j && (freq>1)){
                //until freq of[j]==1;
                //decrement freq of [i]
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),1)-1);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
                freq=map.get(s.charAt(j));
            }
            maxLength=Math.max(maxLength,j-i+1);//j-i gives actual length of substring
            //expand window
            j++;
        }
        return maxLength;
    }
}