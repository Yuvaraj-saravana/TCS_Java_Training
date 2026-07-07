import java.util.*;
class palindromrange {
    public static boolean ispalindrom(int num){
        int orginal = num;
        int reverse = 0;
        
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return orginal == reverse;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the min number:");
        int min = sc.nextInt();
        
        System.out.println("Enter the max number:");
        int max = sc.nextInt();
        
        System.out.println("Palindroms:");
        
        for(int i = min; i <= max; i++){
            if(ispalindrom(i)){
                System.out.println(i + " ");
            }
        }
    }
}