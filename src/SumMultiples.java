public class SumMultiples {
    public int sumOfMultiples(int n) {
        int sum = 0;
        if(n >= 1 && n <= 10000){
            for(int i = 1; i < n+1; i++){
                if(i%3 == 0 || i%5==0||i%7==0){
                    sum+= i;
                }
            }
            return sum;
        }
        else{
            System.out.print("Incorrect number");
        }
        return sum;
    }
}
