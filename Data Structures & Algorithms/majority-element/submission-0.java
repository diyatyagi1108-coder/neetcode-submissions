class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int n= nums.length;
        int element=nums[0];
        for(int i=0;i<n;i++){
            if(element==nums[i]){
                count++;
            }else if(count==0){
                count=1;
                element=nums[i];}
            else{
                count--;
            }
        }return element;
        
    }
}
        
   