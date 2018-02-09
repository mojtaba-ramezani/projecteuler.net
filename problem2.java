public class problem2 {
    public static void main(String[] args) {
        int i = 1, j = 2, k, sum = 0, n = 4000000;
        while(i < n) {
            if(i % 2 == 0)
                sum += i;

            k = i + j;
            i = j;
            j = k;
        }
        System.out.println(sum);
    }
}