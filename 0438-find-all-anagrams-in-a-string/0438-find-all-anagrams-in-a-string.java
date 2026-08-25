class Solution {
    StringBuilder countingSort(String s){
        char[] c=s.toCharArray();
        int arr[]=new int[26];
        for(char ch:c){
            arr[ch-'a']++;
        }
        //retrieval
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            while(arr[i]!=0){
                sb.append((char) (i+'a'));
                arr[i]--;
            }
        }
        return sb;   
    } 
    public List<Integer> findAnagrams(String s, String p) { 
        List<Integer> list=new ArrayList<>(); 
        int i=0,j=p.length()-1;
        StringBuilder sbs;
        StringBuilder sbp=countingSort(p);
        p=sbp.toString();
        while(j<s.length()){
            sbs=countingSort(s.substring(i,j+1));
            if(p.equals(sbs.toString())){
                list.add(i);
            }
            i++;
            j++;
            
        }
        return list;
    }
}