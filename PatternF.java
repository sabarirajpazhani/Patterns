import java.util.Scanner;

public class PatternF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();

        for(int i=1; i<=(n*2)-1; i++){
            for(int j=1; j<=(n*2)-1; j++){
                int top = i;
                int down = (n*2)-i;
                int left = j;
                int right = (n*2)-j;

                int m = Math.min(Math.min(top, down), Math.min(left, right));
                System.out.print(m);

                // System.out.print(n-m+1);
            }
            System.out.println();
        }
    }
}


// 111111111
// 122222221
// 123333321
// 123444321
// 123454321
// 123444321
// 123333321
// 122222221
// 111111111




// 555555555
// 544444445
// 543333345
// 543222345
// 543212345
// 543222345
// 543333345
// 544444445
// 555555555