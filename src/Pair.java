import java.util.Objects;

public class Pair<K, V> {

    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        this.key = key;
        this.value = value;
    }

    // Static factory method
    public static <K, V> Pair<K, V> create(K key, V value) {
        return new Pair<>(key, value);
    }

    // Getters
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // toString method
    @Override
    public String toString() {
        return "(Key: " + key + ", Value: " + value + ")";
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair<?, ?>)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key) &&
                Objects.equals(value, pair.value);
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}