import java.util.*;
public class length{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number:");
int num = sc.nextInt();

int res = 0;

while(num > 0){
res += 1;
num = num/10;
}
System.out.println(res);
}
}