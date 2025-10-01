class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split("\\s+");
        int count = 0;

        for (String word : words) {
            boolean canType = true;
            for (int i = 0; i < brokenLetters.length(); i++) {
                if (word.indexOf(brokenLetters.charAt(i)) != -1) {
                    canType = false;
                    break;
                }
            }
            if (canType) count++;
        }

        return count;
    }
}
