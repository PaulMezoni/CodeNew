import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AddMapKey {
    public static void main(String[] args) {
        addMap();
    }

    private static final Map<Key, String> map = new HashMap<>();

    public static void addMap() {
        for (int i = 0; i < 50_000; i++) {
            map.put(new Key("key"), "Urusus");
        }
    }


    public static class Key {
        private final String key;

        public Key(String key) {
            this.key = key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key1 = (Key) o;
            return Objects.equals(key, key1.key);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }
    }
}
