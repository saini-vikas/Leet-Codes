import java.util.List;
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] result = new boolean[s.length()+1];
        for (int i=0; i<result.length; i++){
            if (i == result.length -1){
                result[i] = true;
            }else {
                result[i] = false;
            }
        }
        for (int j=s.length()-1; j>-1; j-- ){
            for (String word: wordDict){
                if (j+word.length() <= s.length() && s.substring(j, j + word.length()).equals(word)){
                    result[j] = result[j + word.length()];

                }
                if (result[j]){
                    break;
                }
            }
        }
        return result[0];
    }
}
