class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        if(nums.length==1) return nums[0];
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[left]<nums[mid]){
                if(nums[right]>nums[mid]){
                    return nums[left];
                }
                else{
                    left=mid+1;
                }
            }
            else if(nums[left]>nums[mid]){
                right=mid;
            }
            else{//nums[left]==nums[mid]
                if(nums[left]<nums[right]){
                    return nums[left];
                }
                else{
                    return nums[right];
                }
            }
        }
        return nums[left];
    }
}