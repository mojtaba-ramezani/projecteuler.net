import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem6 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        System.out.println("Please enter the first {number} of natural numbers: (number can be 1 to n)");
        try {
            num = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sumOfSquares = 0, squareOfSum = 0, sumOfNum = 0, difference;
        for (int i = 1; i <= num; i++) {
            sumOfSquares += i * i;
            sumOfNum += i;
        }
        squareOfSum = sumOfNum * sumOfNum;
        difference = squareOfSum - sumOfSquares;
        System.out.println(difference);
    }
}