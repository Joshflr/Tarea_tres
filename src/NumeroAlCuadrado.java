import java.util.Scanner;

public class NumeroAlCuadrado {
    public static void main(String[] args){
        int n=1, potencia;
        Scanner sc = new Scanner(System.in);

        while (n > 0) {
            System.out.print("Ingrese numero: ");
            n = sc.nextInt();
            if (n>0) {
                potencia = (int)Math.pow(n, 2);
                System.out.println(potencia);
            } else break;
        }
        sc.close();
    }
}
