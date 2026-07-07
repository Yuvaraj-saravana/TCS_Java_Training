import java.util.*;
public class largestdigit{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int num = sc.nextInt();

int largest = 0;
while(num>0){
int digit = num % 10;
if(digit > largest){
largest = digit;
}
num /= 10;
}
System.out.println(largest);
sc.close();
}
}