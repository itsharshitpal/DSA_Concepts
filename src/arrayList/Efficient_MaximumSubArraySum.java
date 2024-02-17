package arrayList;

public class Efficient_MaximumSubArraySum {
    public static int maxSum(int[] arr) {
        int n=arr.length;
        int maxEnding = arr[0];
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,3};

        int res = maxSum(arr);
        System.out.println(res);
    }
}