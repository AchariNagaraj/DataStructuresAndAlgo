class Solution {
    StringBuilder countingSort(String s){
        char[] c=s.toCharArray();
        int[] arr=new int[26];
        for(char ch:c){
            arr[ch-'a']++;
        }
        //retrieval
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            int count=arr[i];
            while(arr[i]!=0){
                sb.append((char) (i+'a'));
                arr[i]--;
            }
            arr[i]=count;
        }
        return sb;   
    } 
    public List<Integer> findAnagrams(String s, String p) { 
        List<Integer> list=new ArrayList<>(); 
        int[] s_arr=new int[26];
        int[] p_arr=new int[26];
        int i=0,j=p.length()-1;
        
        //construct frequency map for p and substring of s of length=p
        if(p.length()<=s.length()){
            for(int k=0;k<p.length();k++){
                p_arr[p.charAt(k)-'a']++;
                s_arr[s.charAt(k)-'a']++;
            }
            while(j<s.length()){
                if(Arrays.equals(s_arr,p_arr)){
                    list.add(i);
                }
                s_arr[s.charAt(i)-'a']--;
                i++;
                j++;
                if(j<s.length()){
                    s_arr[s.charAt(j)-'a']++;
                }  
            }
        }

        
        return list;
    }
}