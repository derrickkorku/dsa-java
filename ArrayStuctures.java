class ArrayStructures {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomNumbers(){
        for (int i = 0; i < arraySize; i++){
            theArray[i] = (int)((Math.random() * 10) + 10);
        }
    }


    public void printArray(){
        System.out.println("------------------------");

        for (int i = 0; i < arraySize; i++){
            System.out.println("| " + i + " |");
            System.out.println("|" + theArray[i] + " |");
            System.out.println("-------------------");
        }
    }

    public int getValueAtIndex(int index){
        if (index < arraySize) return theArray[index];

        return -1;
    }

    public boolean containsValue(int val){
        boolean valExists = false;

        for (int i = 0; i < theArray.length; i++){
            if (theArray[i] == val){
                valExists = true;
            }
        }

        return valExists;
    }

    public void deleteIndex(int index){
        if (index < arraySize){
            for (int i = index; i < (arraySize - 1); i++){
                theArray[i] = theArray[i + 1];
            }

            arraySize--;
        }
    }

    public void insertValue(int val){
        theArray[arraySize] = val;
        arraySize++;
    }

    public static void main(String[] args) {
        ArrayStructures arr = new ArrayStructures();
        arr.generateRandomNumbers();
        arr.printArray();
    }
}