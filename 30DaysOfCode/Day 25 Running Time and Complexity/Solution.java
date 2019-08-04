import java.io.*;
import java.util.*;

public class Solution {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();

            if (n >= 2 && isPrime(n))
                System.out.println("Prime");
            else System.out.println("Not prime");
        }
    }
}