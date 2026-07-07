import java.util.*;
class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int orginal = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        
        while(n > 0){
            int digit = n % 10;
            sum += (int) Math.pow(digit,digits);
            n /= 10;
        }
        
        if( sum == orginal){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}