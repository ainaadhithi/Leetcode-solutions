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





NOTES:
We can also solve by taking count of 0,1,2 then updating array in the order-->0,1,2
```
import java.util.*;

public class Main {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0) cnt0++;
            else if (arr.get(i) == 1) cnt1++;
            else cnt2++;
        }

        //Replace the places in the original array:
        for (int i = 0; i < cnt0; i++) arr.set(i, 0); // replacing 0's

        for (int i = cnt0; i < cnt0 + cnt1; i++) arr.set(i, 1); // replacing 1's

        for (int i = cnt0 + cnt1; i < n; i++) arr.set(i, 2); // replacing 2's
    }

    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }
}
```
**We can also solve in BruteForce method : i.e., by using any SORTING Algorithm**
