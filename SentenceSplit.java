import java.util.*;

class SentenceSplit {
    public static void solution(String s) {
        String[] arr = s.split("\\.|\\?|\\!"); 

        printarr(arr);

        int wcount = 0;

        List<Integer> farr = new ArrayList<Integer>();

        
        for (int i = 0; i < arr.length; i++){
             String[] warr = arr[i].trim().split(" ");
             printarr(warr);

             for (String item : warr){
                if (item.trim().length() > 0){
                    wcount++;
                }
             }

             
             if (wcount > 0){
                farr.add(wcount);
                wcount = 0;
             }
             
        }

        Collections.sort(farr);

        System.out.print(farr.get(farr.size() - 1));
    }


    public static void printarr(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        solution("Forget  CVs..Save time . x x");
    }
}