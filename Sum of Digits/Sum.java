import java.util.*;
class Sum{
    public static void main(String args []) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, n=num;
        while(num > 0){
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.println("The sum of " + n + " is " + sum);        
    }
}
