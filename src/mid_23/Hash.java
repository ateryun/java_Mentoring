package mid_23;

public class Hash {
    private int hashBase;
    private int hashSize;

    public Hash(int hashBase, int hashSize) {
        this.hashBase = hashBase;
        this.hashSize = hashSize;
    }
    public long getHashValue(String str) {
        long hashValue = 0;
        int n = str.length();

        for(int i=0; i<n; i++) {
            hashValue += str.charAt(i) * Math.pow(hashBase, n-1-i);
            hashValue %= hashSize;
        }
        return hashValue;
    }
}
