//SEE other approaches in notes
//Dutch national flag Algorithm
class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int mid=0;
        int end=nums.length-1;
        
        for(int i=0;i<nums.length; i++){
            if(nums[mid]==0){
                //then swap
                int temp=nums[start];
                nums[start]=nums[mid];
                nums[mid]=temp;

                mid++;
                start++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{ 
                int temp=nums[end];
                nums[end]=nums[mid];
                nums[mid]=temp;

                end--;
            }
        }
    }
}