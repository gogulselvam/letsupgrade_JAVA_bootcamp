import java.util.*;
class Armstrong{
    static int power(int p, int b){
        int power=1;
        for(int i=1;i<=b;i++){
            power=power*p;
        }
        return power;
    }
    static int count(int num){
        int n=0;
        while(num!=0){
            n++;
            num=num/10;
        }
        return n;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int original = num, sum = 0;
        int c= count(num);
        while(num!=0){
            sum =sum + power((num%10),c);
            num=num/10;
        }
        if(original==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}