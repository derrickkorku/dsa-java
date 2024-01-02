class RotateArray {

    public static void rotateByOne(int[] arr, int n) {
        int temp = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp;
    }

    public static void rotateArray(int[] arr, int n, int d) {
        for (int i = 0; i < d; i++) {
            rotateByOne(arr, n);
        }
    }

    public static Object[] rotateArray(Object[] arr) {
        Object[] result = new Object[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[(i + 1) % arr.length] = arr[i];
        }

        return result;
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        System.out.println(x);
    }
}