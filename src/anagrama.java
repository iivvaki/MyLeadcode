import java.util.Arrays;

public class anagrama {
    public boolean isAnagram(String s, String t) {

        if(s.length() == t.length()){
            char[] strS = s.toCharArray();
            char[] strT = t.toCharArray();
            Arrays.sort(strS);
            Arrays.sort(strT);
            for(int i = 0; i < s.length(); i++){
                if(strS[i] != strT[i]){
                    return false;
                }
            }
            return true;

        }
        else{
            return false;
        }

    }
}
