class Solution {
    public boolean detectCapitalUse(String word) {
        if (allCaps(word) || allLower(word) || tC(word)) {
            return true;
        }
        return false;
    }

    public boolean allCaps(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        if (word.length() == count) {
            return true;
        }
        return false;
    }

    public boolean allLower(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                count++;
            }
        }
        if (word.length() == count) {
            return true;
        }
        return false;
    }

    public boolean tC(String word) {
        char ch = word.charAt(0);
        String s = word.substring(1);
        if (Character.isUpperCase(ch) && allLower(s)) {
            return true;
        }
        return false;
    }
}
