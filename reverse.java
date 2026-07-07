import java.util.*;
class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int reverse = 0;
        
        while(n > 0){
            int digits = n % 10;
            reverse = 10 * reverse + digits;
            n /= 10;
        }
        
        System.out.println(reverse);
        sc.close();
    }
}