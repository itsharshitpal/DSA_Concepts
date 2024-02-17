package arrayList;

class Naive_PrefixSum {
    static int getSum(int[] arr, int l, int r) {
        int res = 0;
        for (int i = l; i <= r; i++)
            res += arr[i];
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5};
        int l = 1;
        int r = 3;
        System.out.println(getSum(arr, l, r));
    }
}

class Efficient_PrefixSum {
    static int getSum(int[] ps, int l, int r) {
        if (l == 0) return ps[r];
        return ps[r] - ps[l - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5, 4};
        int n = 7;
        int[] ps;
        ps = new int[n];
        ps[0] = arr[0];
        for (int i = 1; i < n; i++)
            ps[i] = ps[i - 1] + arr[i];
        System.out.println(getSum(ps, 1, 3));
    }
}