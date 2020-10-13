package Naive;

public class Topic366 {
    public int fibonacci(int n) {
        // write your code here
        if(n == 1)
            return 0;
        double a1 = Math.pow((1+Math.sqrt(5))/2.0, n-1);
        double a2 = Math.pow((1-Math.sqrt(5))/2.0, n-1);
        double resD = (a1 - a2) / Math.sqrt(5);
        return (int)Math.round(resD);
    }
}
