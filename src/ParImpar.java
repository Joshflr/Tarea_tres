import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int num = 1;
        Scanner sc = new Scanner(System.in);

        while (num!=0) {
            System.out.print("Ingrese numero: ");
            num = sc.nextInt();
            if (num != 0) {
                if (num%2 ==0) System.out.println(num+" numero par");
                else System.out.println(num+" numero impar");
            } else {
                System.out.println("PROGRAMA FINALIZADO");
                break;
            }
        }
        sc.close();
    }
}
