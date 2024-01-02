class BinarSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7, 7, 8, 8};
        int result = search(1, arr);
        System.out.println(result);
    }

    public static int compare(int num1, int num2) {
        return num1 > num2 ? 1 : (num1 < num2) ? -1 : 0;
    }

    public static int search(int searchItem, int[] arr) {
        int leftIndex  = 0;
        int rightIndex = arr.length - 1;
        int middleIndex = (leftIndex + rightIndex) / 2;

        boolean found = false;

        if (searchItem == arr[middleIndex]){
            return middleIndex;
        }

        while(leftIndex <= rightIndex){
            switch(compare(searchItem, arr[middleIndex])){
                case 1:
                leftIndex = middleIndex + 1;
                break;
                case -1: 
                rightIndex = middleIndex - 1;
                break;
                default:
                found = true;

            }

            if (found){
                break;
            } else {
                middleIndex = (leftIndex + rightIndex) / 2;
            }
        }

        return middleIndex;
    }

    public static int searchFinal(int key, int[] arr){
        int lo = 0;
        int hi = arr.length;

        while (lo <= hi){
            int middle = lo + (hi - lo)/2;

            if (key < arr[middle]) hi = middle - 1;
            else if (key > arr[middle]) lo = middle + 1;
            else return middle;
        }

        return -1;
    }
}