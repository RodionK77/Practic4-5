package Practic5;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        f1(N, 1);
        N = scan.nextInt();
        System.out.println(f2(N));
        N = scan.nextInt();
        System.out.println(f3(N, 0));
    }
    public static void f1(int n, int i){ //2
        if(i!=n){
            System.out.println(i);
            i++;
            f1(n, i);
        }
        else System.out.println(n);
    }
    public static int f2(int N){ //5
        if(N!=0){
            return N%10 + f2(N/10);
        }else return 0;
    }
    public static int f3(int N, int s){ //10
        if (N!=0){
            return f3(N/10, 10*s+N%10);
        }else return s;
    }
}