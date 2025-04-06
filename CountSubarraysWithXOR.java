import java.util.*;

public class CountSubarraysWithXOR {
    public static int countSubarrays(int[] nums, int target) {
        Map<Integer, Integer> prefixXorCount = new HashMap<>();
        int count = 0;
        int xor = 0;

        for (int num : nums) {
            xor ^= num;

            if (xor == target)
                count++;

            int requiredXor = xor ^ target;

            count += prefixXorCount.getOrDefault(requiredXor, 0);

            prefixXorCount.put(xor, prefixXorCount.getOrDefault(xor, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 4};
        int target = 6;
        int result = countSubarrays(nums, target);
        System.out.println("Number of subarrays with XOR " + target + ": " + result);
    }
}
