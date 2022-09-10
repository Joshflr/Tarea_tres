import java.util.Scanner;

public class Sumatoria {
    public static void main(String[] args) {
        int n = 1, sumatoria = 0;
        Scanner sc = new Scanner(System.in);

        while (n!= 0) {
           System.out.print("Ingrese numero: ");
           n = sc.nextInt();
           if (n != 0) {
            sumatoria+=n;
           } else {
             System.out.println("La sumatoria es de: "+sumatoria);
             break;
           }
        }
        sc.close();
    }
}
