package PatternA;

import java.util.Scanner;

public class PatternA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){

            int x=0;
            if(i%2!=0){
                x=1;
            }
            else{
                x=0;
            }

            for(int j=1; j<=i; j++){
                System.out.print(x+" ");

                if(x==1){
                    x=0;
                }
                else{
                    x=1;
                }
            }
            System.out.println();
        }
    }
}


        // 1 
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1