import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num==0) System.out.println(0);
        else binaryRecursive(num);

    }

    public static void binaryRecursive(int num){
        if(num > 0) {
            binaryRecursive(num/2);
            System.out.print(num%2);
        }
    }
}
