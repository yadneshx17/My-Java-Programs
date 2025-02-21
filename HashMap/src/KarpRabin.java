public class KarpRabin {
    private final int PRIME = 101;

    private double calculateHash(String str) {
        double hash = 0;
        for(int i=0; i < str.length(); i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    // New Hash for new 1 char and 1 char will be removed.
    private double updateHash(double prevHash, char oldChar, char newChar, int patternLength) {
        double newHash = (prevHash - oldChar) / PRIME;
        newHash = newHash + newChar * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

    // pattern means - the string we have to find in "text".
    public void search(String text, String pattern) {
        int patternLength = pattern.length();
        // Hashes of both
        double patternHash = calculateHash(pattern); // hash of kunal
        double textHash = calculateHash(text.substring(0, patternLength));


        for(int i=0; i<= text.length() - patternLength; i++){
            if(textHash == patternHash) {
                if(text.substring(i, i+patternLength).equals(pattern)) {
                    System.out.println("Pattern found at index :" + i);
                }
            }
            // if not matches update the hash.
            if (i < text.length() - patternLength) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);
            }
        }
    }
}