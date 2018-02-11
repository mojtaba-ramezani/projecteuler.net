import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long num = 0;
        long largest = 0;
        System.out.println("Please enter a number:");
        try {
            num = Long.parseLong(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(long i = 3; i * i < num; i += 2)
            if (num % i == 0 && isPrime(i)) largest = i;

        System.out.println("the largest prime factor of the " + num + " is: " + largest);
    }
    public static boolean isPrime(long n) {
        if(n % 2 == 0) return false;
        for(long i = 3; i * i < n; i += 2)
            if(n % i == 0) return false;

        return true;
    }
}