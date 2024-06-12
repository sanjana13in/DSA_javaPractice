public class Linear {
    public static void main(String[] args) {
        int nums[] = { 3, 6, 8, 9, 11 };
        int target =19;

        int result = linearSearch(nums, target);
        if (result != -1)
            System.out.println("Element found in index" + result);

        else
            System.out.println("element not found");

    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;

        }
        return -1;
    }
}
