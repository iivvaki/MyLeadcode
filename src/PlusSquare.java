public class PlusSquare {
    public static String generateShape(int n) {
        String shape = "";

        for(int i = 0 ; i < n; i++){
            for(int j = 0; j< n; j++){
                shape += '+';
            }
            if(i+1 != n){
                shape+='\n';
            }else{
                break;
            }

        }
        System.out.print(shape);
        return shape;
    }
}
