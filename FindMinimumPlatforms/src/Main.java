import java.util.Arrays;

public class Main {

    public static int findMinimumPlatform(int[] arrival, int[] departure){
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int arrivalPointer = 0;
        int departurePointer = 0;

        int platformNeeded = 0;

        int platformInUse = 0;

        while (arrivalPointer < arrival.length && departurePointer < departure.length){
            if (arrival[arrivalPointer] <= departure[departurePointer]){
                platformInUse++;
                arrivalPointer++;
            } else {
                platformInUse--;
                departurePointer++;
            }

            platformNeeded = Math.max(platformNeeded, platformInUse);
        }

        return platformNeeded;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}