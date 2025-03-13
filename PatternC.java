import java.util.Scanner;

public class PatternC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=(n*2)-1; i++){
            int x = i>n ? (n*2)-i : i;

            for(int j=1; j<=x; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *