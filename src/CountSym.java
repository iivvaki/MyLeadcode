public class CountSym {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> mapFind = new HashMap<>();
        if(str.length() == 0){
            return mapFind;
        }

        char[] arr = str.toCharArray();
        char sym;

        for(int i = 0; i < str.length();i++){
            if(!mapFind.containsKey(arr[i])){
                mapFind.put(arr[i], 1);

            }else{
                mapFind.replace(arr[i], mapFind.get(arr[i]) + 1);
            }

        }
        return mapFind;
    }
}
