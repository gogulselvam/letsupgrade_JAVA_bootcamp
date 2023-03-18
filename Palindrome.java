import java.util.*;
class Palindrome{
    public static void main(String args []) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, rev = 0;
        while(temp > 0){
            int r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
        }
        if(rev == num){
            System.out.println("Given number " + rev + " is a Palindrome");
        }
        else{
            System.out.println("Given number " + rev + " is not a Palindrome");
        }
    }
}
