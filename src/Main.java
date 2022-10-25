import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("jarolv");
        System.out.print("hola buenos dias ingrese su numero para saber si es par o IMPAR ");
        int n = leer.nextInt();

        if (n % 2 ==0 ) {

            System.out.printf("si el numero %d es PAR\n" , n);

        } else {

            System.out.printf("si el numero %d es IMPAR\n" , n);


        }
    }


}
