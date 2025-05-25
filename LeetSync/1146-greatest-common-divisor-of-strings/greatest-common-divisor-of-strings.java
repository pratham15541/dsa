class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // If concatenation is not commutative, no GCD exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // GCD string
        return str1.substring(0, gcdLength);
    }

    // Euclid's Algorithm
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
