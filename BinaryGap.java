import java.util.*;


class BinaryGap {

    public static int solution(int N){
        Queue<Integer> bStack = createBinaryStack(N);
        int gap = 0;

        int el = -1;

        List<Integer> farr = new ArrayList<Integer>();

        while(!bStack.isEmpty()){
            int item = bStack.remove();

            if (item == 1){
                if (gap > 1){
                    farr.add(gap);
                    gap = 0;
                }
            }

            if (item == 0){
                gap++;
            }

        }

        if (farr.size() != 0){
            Collections.sort(farr);
            el = farr.get(farr.size() - 1);
        }


        return el == -1 ? 0 : el;
    }

    public static Queue<Integer> createBinaryStack(int N){
        String binaryString = Integer.toBinaryString(N);

        System.out.println("Binary String " + binaryString);

        Queue<Integer> bStack = new LinkedList<Integer>();

        for (int i = 0; i < binaryString.length(); i++){
            bStack.add(Character.getNumericValue(binaryString.charAt(i)));
        }

        return bStack;
    }
    public static void main(String[] args) {
        System.out.println(solution(529));
    }
}