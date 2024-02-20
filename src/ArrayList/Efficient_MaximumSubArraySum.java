package arrayList;

public class Efficient_MaximumSubArraySum {
    public static int maxSum(int[] arr) {
        int maxEnding = arr[0];
        int res = arr[0];
        for (int i : arr) {
            maxEnding = Math.max(maxEnding + i, i);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 3};

        int res = maxSum(arr);
        System.out.println(res);
    }
}