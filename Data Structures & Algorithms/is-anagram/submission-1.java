class Solution {
    
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> charCountS = new HashMap<>();
        HashMap<Character, Integer> charCountT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            charCountS.put(charS, charCountS.getOrDefault(charS, 0) + 1);
            charCountT.put(charT, charCountT.getOrDefault(charT, 0) + 1);

        }

        return charCountS.equals(charCountT);
    }

    
}
