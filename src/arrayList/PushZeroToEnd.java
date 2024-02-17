package arrayList;

/* Java program to push zeroes to back of array */
class PushZeroToEnd {
    static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0; // Count of non-zero elements
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)

                arr[count++] = arr[i];
        while (count < n)
            arr[count++] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
