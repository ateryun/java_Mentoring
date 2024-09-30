package mid_23;

public class HashValue {
    private String str;
    private long hash;

    public HashValue(String str, long hash) {
        this.str = str;
        this.hash = hash;

    }
    public String getStr(){
        return str;
    }
    public long getHash() {
        return hash;
    }

}
