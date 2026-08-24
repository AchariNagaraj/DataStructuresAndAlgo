class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i1=-1,i2=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            
            if(map.containsKey(target-nums[i])){
                i2=map.get(target-nums[i]);
                i1=i;
                break;
            }
            
            map.put(nums[i],i);
        }

        return new int[]{i1,i2};
        
    
    }
}