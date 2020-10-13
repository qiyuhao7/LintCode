package Easy;

public class T2 {
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long res = 0;
        while(n != 0){
            n /= 5;
            res += n;
        }
        return res;
    }

}
