package Naive;

public class Topic37 {

    int reverseInteger(int number){
        int a = number / 100;
        int b = (number % 100) / 10;
        int c = number % 10;
        return c * 100 + b * 10 + a;
    }
}
