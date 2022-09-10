import java.util.Scanner;

public class Adivinando {
    public static void main(String[] args) {
        int num = (int)(Math.random()*(50+1));
        int x=0;
        Scanner sc = new Scanner(System.in);

        while (num!=x) {
            System.out.print("Ingrese numero: ");
            x= sc.nextInt();
            if (x == num) {
                System.out.println("ACERTASTE, EL JUEGO ACABO");
                break;
            }else{
                if (x< num) {
                    System.out.println("Tiene que ser numero mayor");
                } else {
                    System.out.println("Tiene que ser numero menor");
                }
            }
        }
        sc.close();
    }
}
