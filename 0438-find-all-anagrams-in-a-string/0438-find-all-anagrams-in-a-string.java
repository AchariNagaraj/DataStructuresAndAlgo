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
        int[] arr=new int[26];
        int i=0,j=p.length()-1;
        
        StringBuilder sbp=countingSort(p);
        p=sbp.toString();
        if(p.length()<=s.length()){
            for(int k=0;k<p.length();k++){
                arr[s.charAt(k)-'a']++;
            }
        }
        while(j<s.length()){
            //retrieve
            StringBuilder sbs=new StringBuilder();
            for(int k=0;k<26;k++){
                int c=arr[k];
                while(arr[k]!=0){
                    sbs.append((char) (k+'a'));
                    arr[k]--;
                }
                arr[k]=c;
            }
            if(sbs.toString().equals(p)){
                list.add(i);
            }
            arr[s.charAt(i)-'a']--;
            i++;
            j++;

            if(j<s.length()){
                arr[s.charAt(j)-'a']++;
            }
            
        }
        return list;
    }
}