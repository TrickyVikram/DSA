package ArrayQ;

import java.util.ArrayList;
import java.util.List;

// To generate all subarrays from a given array
public class SubarrayGenerator {

    public static List<int[]> generateAllSubarrays(int[] nums) {
        List<int[]> result = new ArrayList<>(); // To store the generated subarrays
        int n = nums.length;

        // Generate all possible subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Create the subarray from start to end
                int[] subarray = new int[end - start + 1];
                System.arraycopy(nums, start, subarray, 0, end - start + 1);
                result.add(subarray); // Add the subarray to the result
            }
        }

        return result; // Return the list of all subarrays
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4}; // Example input
        List<int[]> subarrays = generateAllSubarrays(arr);

        // Print all the generated subarrays
        System.out.println("All Subarrays:");
        for (int[] subarray : subarrays) {
            System.out.print("[");
            for (int num : subarray) {
                System.out.print(num + " ");
            }
            System.out.print("] ");
        }
    }
}
