class Solution {
    public boolean isIsomorphic(String s, String t) {
       if (s.length() != t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (mapS[cs] != mapT[ct]) {
                return false;
            }

            // Store index+1 (since default is 0)
            mapS[cs] = i + 1;
            mapT[ct] = i + 1;
        }

        return true; 
    }
}