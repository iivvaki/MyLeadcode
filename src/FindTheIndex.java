public class FindTheIndex {
    
        public int strStr(String haystack, String needle) {
            if(needle.length() > haystack.length()) return -1;
            char[] haystackChar = haystack.toCharArray();
            char[] needleChar = needle.toCharArray();

            for(int i = 0; i <= haystack.length()-needle.length(); i++){
                if(haystackChar[i] == needleChar[0]){
                    boolean res = true;
                    for(int j = 0; j < needle.length(); j++){
                        if(haystackChar[j+i] != needleChar[j]){
                            res = false;
                            break;
                        }
                    }
                    if(res)return i;

                }
            }
            return -1;
        }

}
