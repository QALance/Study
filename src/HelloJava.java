import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите катет A:");
        int A = in.nextInt();
        System.out.print("Введите катет B:");
        int B = in.nextInt();
        double z;
        z = Math.sqrt(A*A+B*B);
        System.out.println("Длина гипотенузы:" + z);
    }
}
