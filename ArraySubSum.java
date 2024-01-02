class ArraySubSum {
    public static int arraySubSum(int arr[], int size){
        int sum = inter = 0;

        for (int i =0; i < size; i++){
            inter += arr[i];
            if (inter < 0) {
                inter = 0;
            } 

            else if (sum < inter){
                sum = inter;
            }
        }

        return sum;
    }
}