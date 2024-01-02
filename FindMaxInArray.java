class FindMaxInArray {
    public static <T extends Comparable<T>> T findMax(T[] data) {
        T max = data[0];

        for (int i = 1; i < data.length; i++) {
            if (max.compareTo(data[i]) < 0) {
                max = data[i];
            }
        }

        return max;
    }
}