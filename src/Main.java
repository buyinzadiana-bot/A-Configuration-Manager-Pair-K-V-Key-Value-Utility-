public class Main {

    public static void main(String[] args) {

        // Pair 1: String key, Integer value
        Pair<String, Integer> pair1 = Pair.create("Age", 25);

        // Pair 2: Integer key, String value
        Pair<Integer, String> pair2 = Pair.create(404, "Not Found");

        // Print results
        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);
    }
}