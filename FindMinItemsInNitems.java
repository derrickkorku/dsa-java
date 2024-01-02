/**
 * Algorithm to Find the largest M items in N items
 */
class FindMinItemsInNItems {
    public static void find() {
        MinOQ<Transaction> minPQ = new MinPQ<Transaction>();

        while (StdIn.hasNextLine()) {
            Transaction t = new Transaction(StdIn.nextLine());

            minPQ.insert(t);

            if (minPQ.size() > MI) {
                minPQ.deleteMin();
            }
        }
    }
}