package PatternE;

import java.util.Scanner;

public class PatternE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = str.length();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==i || j==n-i+1){
                    System.out.print(str.charAt(i-1));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


// R   R
//  O O 
//   L  
//  E E 
// X   X