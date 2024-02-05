import java.util.HashSet;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int count =0;
        for (int i=0; i< s.length(); i++){
            HashSet<Character> set = new HashSet<Character>(s.length());
            for (int j=i; j<s.length(); j++){
                if (!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                }else {
                    break;
                }
            }
            count = Math.max(count, set.size());
        }
        return count;
    }

}
