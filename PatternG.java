import java.util.Scanner;

public class PatternG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int x=1;
            for(int j=0; j<n-i-1; j++){

                System.out.print(" ");
            }

            for(int j=0; j<=i; j++){
                
                System.out.print(x+" ");
                x = x*(i-j)/(j+1);
            }
            System.out.println();

        }
    }
}


//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1