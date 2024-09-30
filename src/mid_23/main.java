package mid_23;

public class main {
    public static void main(String[] args) {
        String text1 = "There was no lack of material; boys happened along every little while; they came to jeer, but remained to whitewash.";
        Midterm midterm1 = new Midterm(3, 47, text1);
        System.out.println("First string hash values:");
        midterm1.printHashValues();

        System.out.println("Is 'remained' in word" + midterm1.isInWords("remained"));
        System.out.println("Is 'gave' in word" +midterm1.isInWords("gave"));

        String text2 = "Tom gave up the brush with reluctance in his face, but alacrity in his heart.";
        midterm1.createHash(3, 37);
        midterm1.setString(text2);

        System.out.println("\nNew hash values after setting new string:");
        midterm1.printHashValues();

        System.out.println("Is 'remained' in words? " + midterm1.isInWords("remained"));
        System.out.println("Is 'gave' in words? " + midterm1.isInWords("gave"));
    }
}
