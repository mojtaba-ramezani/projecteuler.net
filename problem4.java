import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0, largest = 0, product;
        double n;
        System.out.println("Please enter a digit: (for example = 2, 3, 4 or ...)");
        try {
            num = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        n = Math.pow(10, num);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                product = i * j;
                if(isSymmetric(product) && product > largest) largest = product;
            }
        }
        System.out.println(largest);
    }
    public static boolean isSymmetric(int n) {
        int i = 0, j = n;
        while(j > 0) {
            i = (i * 10) + (j % 10);
            j /= 10;
        }
        if(i == n) return true;
        else return false;
    }
}