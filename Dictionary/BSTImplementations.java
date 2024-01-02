package Dictionary;

class BSTImplementations {

    /**
     * Sort keys and remove duplicates
     */
    public static void sortRemoveDuplicateStringKeys() {
        BST<String, Integer> bst = new BST<String, Integer>();

        while (StdIn.hasNextLine()) {
            bst.put(StdIn.readLine(), 0);
        }

        for (String s : bst.keys()) {
            System.out.println(s);
        }
    }
}