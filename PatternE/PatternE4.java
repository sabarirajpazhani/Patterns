package PatternE;

import java.util.Scanner;

public class PatternE4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }


            for(int j=1;j<=(n*2)-(i*2);j++){
                System.out.print(" ");
            }
    
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            System.out.println();
        }

        
    }
}


// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321