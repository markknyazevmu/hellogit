import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count=0;
        for (int i=2;i<number;i++){
            if (isPrime(i)) count++;
        }
        System.out.println(count);
    }

    static boolean isPrime(int num){
        for (int i=2;i<=num/2;i++){
            if (num%i==0) return false;
        }
        return true;
    }
}
