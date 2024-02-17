package arrayList;

class Naive_MajorityElement {
    static int findMajority(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) count++;
            }
            if (count > n / 2) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 8, 6, 6, 6, 6};
        int n = 8;
        System.out.println(findMajority(arr, n));
    }
}

class Efficient_MajorityElement_Moore_Voting_Algorithm {
    static int findMajority(int[] arr, int n) {
        int res = 0, count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i]) count++;
            else count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++)
            if (arr[res] == arr[i]) count++;
        if (count <= n / 2) res = -1;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {8, 8, 6, 6, 6, 4, 6};
        int n = 7;
        System.out.println(findMajority(arr, n));
    }
}