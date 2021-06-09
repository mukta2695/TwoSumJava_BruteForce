class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    int sol[]= {i,j};
                    return sol;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

public class TwoSum {
public static void main(String[] args) {
	int nums[]= {3,2,4};
	int target=6;
	Solution obj= new Solution();
	int result[]=new int[2];
	result=obj.twoSum(nums, target);
	System.out.print("[");
	for(int i=0; i<2; i++) {
		System.out.print(" "+result[i]+" ");
	}
	System.out.print("]");
}
}
