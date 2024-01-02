public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Size: " + map.size());
        System.out.println("one: " + map.get("one"));
        System.out.println("four: " + map.get("four"));

        map.remove("two");
        System.out.println("Size after removing 'two': " + map.size());
    }
}