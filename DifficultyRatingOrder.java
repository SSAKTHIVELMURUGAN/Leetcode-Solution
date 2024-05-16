import java.util.Scanner;

public class DifficultyRatingOrder {
    
    public static boolean comp(int[] d,int n)
    {
        if(n<=1){return true; }
        if(d[n-1] >= d[n-2])
        {
            return comp(d,n-1);

        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
            
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            boolean c = comp(d,n);
            if(c)
            {
             System.out.println("Yes");
            }
            else{ System.out.println("No"); }
 
        }
    }
}
