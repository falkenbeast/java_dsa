//find the number who is not repeating in the array ...

public class ch7_p3 {

    public static int findUnique(int[] nums) {
        int ones = 0, twos = 0, threes = 0;

        for (int num : nums) {
            twos |= ones & num;
            ones ^= num;
            threes = ones & twos;

            ones &= ~threes;
            twos &= ~threes;
        }

        return ones;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 2, 3};  // Example array where 2 appears once and 3 appears three times
        int result = findUnique(nums);
        System.out.println("The number that appears only once is: " + result);
    }
}
