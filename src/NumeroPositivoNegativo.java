import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        int numero = 1;
        Scanner sc = new Scanner(System.in);

        while (numero!=0) {
            System.out.print("Ingrese numero: ");
            numero = sc.nextInt();
            if (numero!=0) {
                if (numero > 0) {
                    System.out.println("El numero es positivo");
                } else {
                    System.out.println("El numero es negativo");
                }
            } else {
                System.out.println("FINALIZO EL PROGRAMA");
                break;
            }
        }
        sc.close();
    }
}
