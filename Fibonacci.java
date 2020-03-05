import java.math.BigInteger;

public class Fibonacci {
    /**
     * fibonacci通项公式计算方法
     *
     * @param n n>0，表明是第n项
     * @return 返回一个BigInteger类型的数
     */
    public static BigInteger of(int n) {
        BigInteger x1 = BigInteger.valueOf(1l);
        BigInteger x2 = BigInteger.valueOf(1l);
        for (int i = 2; i < n; ++i) {
            BigInteger temp = x1.add(x2);
            x1 = x2;
            x2 = temp;
        }
        return x2;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 200; ++i) {
            System.out.println("Fibonacci.of(" + i + ") == " + Fibonacci.of(i));
        }
    }
}
