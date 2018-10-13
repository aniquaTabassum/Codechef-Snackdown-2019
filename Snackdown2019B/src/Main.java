
import java.util.BitSet;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class Main {

    public static void main(String[] args) {
        setPrimes();
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            double toTest = sc.nextInt();
            limit = (int) java.lang.Math.ceil(toTest / 2);
            int m = 0;
            if (toTest == 1) {
                System.out.println("NO");
            } else {
                for (m = 2; m <= limit; m++) {
                    int h = 0;
                    boolean a = isPrime(m);
                    if (a == true) {
                        double n = toTest - m;
                        boolean b = isPrime(n);
                        if (b == true) {
                            System.out.println("YES");
                            h = 1;
                            break;
                        }
                    }
                    if (h == 1) {
                        break;
                    }
                }
            }
            if (m == limit + 1) {
                System.out.println("NO");
            }
            test -= 1;
        }
    }

    static int limit = 0;
    static double i = 0;

    public static boolean isPrime(double x) {
        int l = (int) java.lang.Math.ceil(x);

        for (double j = 2; j <= l; j++) {
            if (bits.get((int) j) == false) {
                double div = x / j;
                //System.out.println("div is "+div+" and i is "+i);
                if (div == java.lang.Math.floor(div) && bits.get((int) div) == false && j != div) {
                    //System.out.println(" and the numbers are "+j+" and "+div);
                    return true;

                }
            }
        }
        return false;
    }
    static BitSet bits = new BitSet(300);

    public static void setPrimes() {
        bits.set(0, true);
        bits.set(2, false);
        for (int i = 2; i <= (int) java.lang.Math.sqrt(1040); i++) {
            for (int j = i + 1; j <= 1042; j++) {
                if (bits.get(j) == true) {
                    continue;
                }

                if (j % i == 0) {
                    bits.set(j, true);

                }
            }
        }

        bits.set(1, true);
    }
}
