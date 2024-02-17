package arrayList;

class Efficient_Sol_LeaderInAnArray {

    static void leaders(int[] arr) {
        int n =arr.length;
        int curr_ldr = arr[n - 1];
        System.out.print(curr_ldr + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (curr_ldr < arr[i]) {
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        leaders(arr);
    }
}

class Naive_Sol_LeaderInAnArray {
    static void leaders(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        int n = 7;
        leaders(arr, n);
    }
}