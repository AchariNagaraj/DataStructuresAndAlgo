class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                int tleft=mid;
                int tright=mid;
                //finding left boundary
                while(left<tright){
                    int lmid=left+(tright-left)/2;
                    if(nums[lmid]==target){
                        tright=lmid;
                    }
                    else{
                        left=lmid+1;
                    }
                }

                //finding right boundary
                while(tleft<right){
                    int rmid=tleft+(right-tleft)/2;
                    if((right-tleft)==1){
                        if(nums[right]==target){
                            tleft=right;
                        }
                        break;
                    }
                    if(nums[rmid]==target){
                        tleft=rmid;
                    }
                    else{
                        right=rmid-1;
                    }
                }
                return new int[]{tright,tleft};
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return new int[]{-1,-1};
        
    }
}