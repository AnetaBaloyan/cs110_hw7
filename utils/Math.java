
package utils;

public class Math {
    public static long factorial(int num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }
    
    public static long factorialLoop(int a) {
        long fact = 1;
        while(a > 0){
            fact *= a;
            a--;
        }
        return fact;
    }
}
