class Solution {
    public void rotateHelper(int i,int j,int[] nums){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        
        int i=0,j=nums.length-1;
        //rotate whole array
        rotateHelper(i,j,nums);

        //rotate the left part
        i=0;j=k-1;
        rotateHelper(i,j,nums);

        //rotate the right part
        i=k;j=nums.length-1;
        rotateHelper(i,j,nums);


    }
}