import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem7 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0, count = 1, i = 1;
        System.out.println("Please enter the {nth} of prime number:");
        try {
            num = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (count < num) {
            if (isPrime(i)) count++;
            i += 2;
        }
        System.out.println(i);
    }

    public static boolean isPrime(int n) {
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;

        return true;
    }
}