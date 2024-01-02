public class MergeTwoSortedArrays {
    public static void mergeArrays(int[] arr1, int[] arr2){
        int arr3len = arr1.length + arr2.length;
        int[] arr3 = new int[arr3len];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length){
            arr3[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length){
            arr3[k] = arr2[j];
            k++;
            j++;
        }
    }
}
