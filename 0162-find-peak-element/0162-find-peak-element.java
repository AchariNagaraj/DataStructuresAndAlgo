class Solution {
    public int findPeakElement(int[] nums) {
       //hint: compare nums[mid-1], nums[mid], nums[mid+1]
       int left=0,right=nums.length-1;
       while(left<right){
            int mid=left+(right-left)/2;
            if(left==mid){//for array of size two
                if(nums[mid+1]>nums[mid]){
                    return mid+1;
                }
                else{
                    return mid;
                }
            }
            if(nums[mid-1]<nums[mid]){
                if(nums[mid+1]<nums[mid]){
                    return mid;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(nums[mid+1]>nums[mid-1]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
       }
       return left;
       
    }
}