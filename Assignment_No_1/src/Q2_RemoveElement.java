
public class Q2_RemoveElement {
	    public static int removeElement(int[] nums, int val) {
	        int k = 0; 
	        
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != val) {
	                nums[k] = nums[i]; 
	                k++; 
	            }
	        }
	        
	        return k;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {3, 2, 2, 3};
	        int val = 3;
	        int k = removeElement(nums, val);
	        System.out.println("Number of elements not equal to val: " + k);
	        System.out.print("Modified nums: [");
	        for (int i = 0; i < k; i++) {
	            System.out.print(nums[i]);
	            if (i < k - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }
	}

