class Solution {
    public boolean isIsomorphic(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            // Existing mapping must be consistent
            if (sToT.containsKey(a) && sToT.get(a) != b) {
                return false;
            }

            // One-to-one mapping
            if (tToS.containsKey(b) && tToS.get(b) != a) {
                return false;
            }

            sToT.put(a, b);
            tToS.put(b, a);
        }

        return true;
        
    }
}