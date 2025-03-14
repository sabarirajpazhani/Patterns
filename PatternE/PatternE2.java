package PatternE;
import java.util.*;


public class PatternE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = str.length();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j || j==n-i+1){
                    System.out.print(str.charAt(j-1));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


// R   X
//  O E 
//   L  
//  O E
// R   X