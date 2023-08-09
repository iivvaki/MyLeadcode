public class convertTempeture {
    public double[] convertTemperature(double celsius) {
        double [] ans = new double[2];
        if(celsius >= 0 && celsius<= 1000){
            ans[1] = celsius * 1.80 + 32.00;
            ans[0] = celsius + 273.15;
            return ans;
        }else{
            System.out.println("that number cant convert");
        }
        return ans;
    }
}
