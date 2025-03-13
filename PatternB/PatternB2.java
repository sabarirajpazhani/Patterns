package PatternB;

import java.util.Scanner;

public class PatternB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x=n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-(i-1); j++){
                System.out.print(x+" ");
            }
            x--;
            System.out.println();
        }
    }
}

// 5 5 5 5 5 
// 4 4 4 4 
// 3 3 3 
// 2 2 
// 1 