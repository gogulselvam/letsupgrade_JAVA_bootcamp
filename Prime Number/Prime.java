import java.util.*;
class Prime{
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.println("First number is : "+ first);
        int last = sc.nextInt();
        System.out.println("Last number is : "+ last);
        System.out.println("Prime numbers from " + first + " to " + last + " are ");
        int i=first,count=0;
        while(i<=last){
            int p=1;
            if(i>1){
                int j=2;
                while(j<=i/2){
                    if(i%j==0){
                        p=0;
                    }
                    j++;
                }
                if(p==1){
                System.out.print(i+" ");
                count++;
                }
            }
            i++;
        }
        System.out.println("\nTotal count of prime numbers from " + first + " to " + last + " is " + count);             
    }
}
