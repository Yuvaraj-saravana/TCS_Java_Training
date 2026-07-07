import java.util.*;
class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int max = 0;
        int min = 9;
        
        while(n > 0){
            int digits = n % 10;
            
            if(digits > max){
                max = digits;                
            }

            
            if(digits < min){
                min = digits;
                
            }
            n /= 10;
        }
        
        System.out.println("Enter maximum number:" + max);
        System.out.println("Enter minimum number:" + min);
        sc.close();

    }
}