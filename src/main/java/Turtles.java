
/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    public int factorial(int n) {

        if (n == 1){
            return n;
        }

        return n * factorial(n - 1);
    }

    public int gcd(int p, int q) {

        if (q == 0) return p;
        else return gcd(q, p%q);
    }
}
