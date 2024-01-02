import java.util.ArrayList;

class IntersectArr {

    public static void main(String[] args) {
        int[] a1 = {1, 8, 3, 2};
        int[] a2 = {4, 2, 6, 1};
        int[] output = checkArr(a1, a2);

        for (int i = 0; i < output.length; i++){
            System.out.println(output[i]);
        }
        
    }

    public static int[] checkArr(int[] a, int[] b){
        int minArr[];
        int maxArr[];

        ArrayList<Integer> arrList = new ArrayList<>();

        if (a.length > b.length){
            minArr = b;
            maxArr = a;
        } else {
            minArr = a;
            maxArr = b;
        }

        int[] finalArr = new int[minArr.length];

        if (a == null || b == null){
            return null;
        }

        if (a.length == 0 || b.length == 0){
            return new int[0];
        }

        for (int i = 0; i < maxArr.length; i++){
            arrList.add(maxArr[i]);
        }

        for (int i = 0; i < minArr.length; i++){
            if (arrList.contains(minArr[i])){
                finalArr[i] = minArr[i];
            }
        }

        return finalArr;
    }

}