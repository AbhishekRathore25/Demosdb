package java12;

public class Binary {

	public static void main(String[] args) {
		
        int nums[]= {1,3,5,7,9,11,13,15,17,19,21};
        int target=15;
        
        int result = binarySearch(nums,target);
        System.out.print(result);
	};

	private static int binarySearch(int[] nums, int target) {
		
		int left =0;
		int right=nums.length-1;
		
		while(left<= right) {
			int mid =(left+right)/2;
			if (nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
				left=mid+1;
				
			}
			else{
				right =mid-1;
			}
		}
		
		return -1;
	}

}
