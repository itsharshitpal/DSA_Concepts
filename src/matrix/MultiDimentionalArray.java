package matrix;

class Example1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}

class Example2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 8, 9}, {4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}

class Example3 {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] arr = new int[m][n];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}

class Example4 {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 10;
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}

class Example5 {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 10;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Example6 {
    public static void main(String[] args) {
        int m = 3;
        int[][] arr = new int[m][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}