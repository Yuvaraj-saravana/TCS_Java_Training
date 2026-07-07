import java.util.*;
class palindromcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        
        int original = num;
        int reversed = 0;
        while(num > 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if(original == reversed){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
        sc.close();
    }
}