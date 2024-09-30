package mid_23;

public class Midterm {
    private Hash hash;
    private HashValue[] hashValues;

    public Midterm(int hashBase, int hashSize, String str) {
        this.hash = new Hash(hashBase, hashSize);
        setString(str);
    }
    public void setString(String str) {
        String[] words = str.split("\\s+");
        hashValues = new HashValue[words.length];

        for(int i = 0; i<words.length; i++) {
            String word = words[i].replaceAll("[.,;]", "").trim();
            long hashValue = hash.getHashValue(word);
            hashValues[i] = new HashValue(word, hashValue);
        }
    }
    public void printHashValues() {
        for (HashValue hv : hashValues) {
            System.out.println(hv.getStr() + " : " + hv.getHash());
        }
    }

    public boolean isInWords(String str) {
        long hashValue = hash.getHashValue(str);

        for (HashValue hv : hashValues) {
            if(hv.getHash() == hashValue && hv.getStr().equals(str)) {
                return true;
            }
        }
        return false;
    }
    public void createHash(int hashBase, int hashSize) {
        this.hash = new Hash(hashBase, hashSize);
    }

}
