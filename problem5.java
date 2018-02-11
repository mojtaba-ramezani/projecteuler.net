import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem5 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        System.out.println("Please enter a range of 1 till a number: (for example = 10, 20, 30 or ...)");
        try {
            num = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int limit = num;
        while (!isDivisible(num, limit)) {
            num++;
        }
        System.out.println(num);
    }

    public static boolean isDivisible(int n, int limit) {
        for (int i = 2; i < limit; i++) {
            if (n % i != 0) {
                return false;
            }
        }
        return true;
    }
}