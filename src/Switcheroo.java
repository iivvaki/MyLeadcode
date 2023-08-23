public class Switcheroo {
    public static String switcheroo(String x) {
        char[] array = x.toCharArray();
        for(int i = 0;i < x.length();i++){
            if(array[i] == 'a') array[i] = 'b';
            else if(array[i] == 'b') array[i] = 'a';
        }
        x = String.valueOf(array);
        return x;
    }
}
