import java.util.Scanner;

public class RunningComparison {
    public static int countHappyDays(int[] a, int[] b, int n, int index) {
        if (index == n) {
            return 0; 
        }
        
        boolean aliceHappy = (a[index] * 2 >= b[index]);
        
        boolean bobHappy = (b[index] * 2 >= a[index]);
        
        int happyDays = 0;
        if (aliceHappy && bobHappy) {
            happyDays = 1;
        }
        
        return happyDays + countHappyDays(a, b, n, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            
            int happyDays = countHappyDays(a, b, n, 0);
            System.out.println(happyDays);
        }

    }
}
