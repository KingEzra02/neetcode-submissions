class Solution {
    
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            charCounts.put(charS, charCounts.getOrDefault(charS, 0) + 1);
            charCounts.put(charT, charCounts.getOrDefault(charT, 0) - 1);

        }

        for(int count : charCounts.values()){
            if(count != 0){
                return false;
            }
        }

        return true;
    }

    
}
