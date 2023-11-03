public class DuplicateKeyException extends Exception {
    private String key;

    public DuplicateKeyException(String key) {
        this.key = key;
    }

    public String toString() {
        return "The " + key + " has aready existed.";
    }
}
