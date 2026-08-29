class Solution {
    public int mySqrt(int x) {
       int left=0,right=x;
       int mid=0;
       if(x==0 || x==1){ //base condition
        return x;
       }
       while(left<=right){
            mid=left+(right-left)/2;
            long sq=(long) mid*mid;
           
            if(sq==x){
                return mid;
            }
            else if(sq<x){
                left=mid+1;//because there is a possibility that this might be the ans
            }
            else{
                right=mid-1;//no possibility of ans
            }   
       }
       return right;
    }
}