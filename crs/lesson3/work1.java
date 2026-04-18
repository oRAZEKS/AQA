package lesson3;
import java.util.Arrays;

public class work1 {
    static void main(String[] args) {

int[] nums1 = {1,3};
//int[] nums2 = {2};
        int[] nums2 = {2,4};
        System.out.println(findMedianSortedArrays(nums1, nums2)); // 2.0

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
int[] nums = new int[nums1.length + nums2.length];
System.arraycopy(nums1,0, nums, 0, nums1.length);
System.arraycopy(nums2, 0, nums,nums1.length, nums2.length);
    Arrays.sort(nums);
    int n = nums.length;
    if(n % 2 == 1){
return (double) nums[n / 2];
    }else {return (nums[n / 2 - 1] + nums[n / 2]) / 2.0;}
    }
}
