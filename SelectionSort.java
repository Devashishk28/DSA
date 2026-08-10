public class SelectionSort {

    public static int[] sortArray(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            int smallest = i;

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[smallest] > nums[j]) {
                    smallest = j;
                }
            }

            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {5, 2, 3, 1};

        int[] result = sortArray(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}