// Time Complexity : Olog(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]== target) return mid;
            else if(nums[mid]>=nums[low]){
                if(nums[low]<=target && nums[mid]>target){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid]< target && nums[high]>= target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}