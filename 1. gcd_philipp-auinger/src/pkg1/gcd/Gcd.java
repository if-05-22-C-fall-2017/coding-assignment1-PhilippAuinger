package pkg1.gcd;

/**
 * @author Philipp Auinger 3CHIF
 */
public class Gcd {

    static int gcdPrimeFactors(int a, int b) {
        int gcd = 0;

        for (int i = 2; i <= a && i <= b; i++) {   //prime number
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    static int gcdEucledian(int a, int b) {

        if (a == 0 || b == 0) {                 //Euclidean algorithm
            return a + b;                       //if one of the two numbers are 0,
                                                //return the one that is not 0
        }
        return gcdEucledian(b, a % b);
    }

    public static void main(String[] args) {
                                                     //testing
        System.out.println(gcdEucledian(64, 18));
        System.out.println(gcdPrimeFactors(64, 18));

        System.out.println(gcdEucledian(30, 15));
        System.out.println(gcdPrimeFactors(30, 15));

        System.out.println(gcdEucledian(334, 28));
        System.out.println(gcdPrimeFactors(334, 28));

        System.out.println(gcdEucledian(68, 26));
        System.out.println(gcdPrimeFactors(68, 26));

        System.out.println(gcdEucledian(77, 11));
        System.out.println(gcdPrimeFactors(77, 11));
    }
}
