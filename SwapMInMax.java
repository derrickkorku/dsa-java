class SwapMinMax {
    public static int[] swapMinMax(int[] arr){
        int minIndex = getMinIndex(arr);
        int maxIndex = getMaxIndex(arr);
        return swap(arr, minIndex, maxIndex);
    }


    public static int getMinIndex(int[] ar){
        int minIndex = 0;

        for (int i = 1; i < ar.length; i++){
            if (ar[i] < ar[minIndex]){
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static int getMaxIndex(int[] ar){
        int maxIndex = 0;
        for (int i = 1; i < ar.length; i++){
            if (ar[i] > ar[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int[] swap(int[] arr, int minIndex, int maxIndex){
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        return arr;
    }
}