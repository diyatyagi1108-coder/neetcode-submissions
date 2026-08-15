class Solution {
    void swap(int[] nums,int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int start=0;
        int cur=0;
        int n=nums.length;
        int end=n-1;
        while(cur<=end){
            if(nums[cur]==0){
                swap(nums,cur,start);
                cur++;
                start++;
            }
            else if(nums[cur]==1){
                cur++;
            }
            else{
                swap(nums,end,cur);
                end--;
            }
        }
        
    }
}
    