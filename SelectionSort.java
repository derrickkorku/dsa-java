class SelectionSort {

    public static void sort(int[] arr){
        int[] n = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
             int smallest = arr[i];

             for (int j = i + 1; j < arr.length; j++){
                 if(smallest > arr[j]){
                     int nj = arr[j];
                     arr[j] = smallest;
                     smallest = nj;
                 }
             }

             n[i] = smallest;
             System.out.println(i + "-------" +  n[i]);
        }

    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 6, 10, 8, 9};
        sort(arr);
    }
}