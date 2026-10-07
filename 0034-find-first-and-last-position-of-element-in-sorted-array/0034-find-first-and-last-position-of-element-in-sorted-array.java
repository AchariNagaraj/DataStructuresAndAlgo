class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        boolean flag=false;
        int lb=-1,rb=-1;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                flag=true;
                lb=mid;rb=mid;
                while(left<lb){
                    int midL=left+(lb-left)/2;
                    if(nums[midL]==target){
                        lb=midL;
                    }
                    else{
                        left=midL+1;
                    }
                }
                while(rb<=right){
                    int midR=rb+(right-rb)/2;
                    
                    if(nums[midR]==target){
                        rb=midR+1;
                    }
                    else{
                        right=midR-1;
                    }
                    
                }
                break;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return (flag)?new int[]{lb,rb-1}:new int[]{-1,-1};
        
        
    }
}