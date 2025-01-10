import java.util.Arrays;
import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String N=sc.nextLine();
        char[] digits=N.toCharArray();
        Arrays.sort(digits);
        for(int i= digits.length-1;i>=0;i--){
            System.out.print(digits[i]);
        }
    }
}
