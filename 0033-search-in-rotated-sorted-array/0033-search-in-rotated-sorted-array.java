class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                if(nums[right]==target){
                    return right;
                }
                if(nums[right]>nums[mid]){
                    if(nums[right]>target){
                        left=mid+1;
                    }
                    else{
                        right=mid-1;
                    }
                }
                else{//nums[right]<nums[mid]
                    left=mid+1;
                }
            }
            else{//nums[mid]>target
                if(nums[left]==target){
                    return left;
                }
                if(nums[left]<nums[mid]){
                    if(nums[left]<target){
                        right=mid-1;
                    }
                    else{//nums[left]>target
                        left=mid+1;
                    }
                }
                else if(nums[left]>nums[mid]){//nums[left]>nums[mid]
                    right=mid-1;

                }
                else{//left is same as mid
                    left=mid+1;
                }
            }
        }
        return -1;
            
    }
}
